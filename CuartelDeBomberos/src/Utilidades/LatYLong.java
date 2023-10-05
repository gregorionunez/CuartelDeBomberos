package Utilidades;

import java.io.*;
import java.net.*;
import org.json.*;

public class LatYLong {
    
    private static final double RADIO_TIERRA_KM = 6371.0;
    
    public static String latitudLongitud(String address) {
        try {
            // Construir la URL de la solicitud a la API de Geocodificación
            String apiKey = "AIzaSyBJQ0cIG2F7ZGoHu2h03cPe9U-qAmtLqcg"; // Reemplaza con tu clave API
            String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" +
                    URLEncoder.encode(address, "UTF-8") + "&key=" + apiKey;

            // Realizar la solicitud HTTP y procesar la respuesta
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // Parsear la respuesta JSON
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONArray results = jsonResponse.getJSONArray("results");
                if (results.length() > 0) {
                    JSONObject location = results.getJSONObject(0).getJSONObject("geometry").getJSONObject("location");
                    double latitude = location.getDouble("lat");
                    double longitude = location.getDouble("lng");
                    return "Latitud: " + latitude + ", Longitud: " + longitude;
                } else {
                    return "No se encontraron resultados.";
                }
            } else {
                return "Error al realizar la solicitud.";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return "Error: " + ex.getMessage();
        }
    }
    
    
    // Calcula la distancia entre dos puntos geográficos en kilómetros
    public static double calcularDistancia(double latitud1, double longitud1, double latitud2, double longitud2) {
        // Convierte las latitudes y longitudes de grados a radianes
        latitud1 = Math.toRadians(latitud1);
        longitud1 = Math.toRadians(longitud1);
        latitud2 = Math.toRadians(latitud2);
        longitud2 = Math.toRadians(longitud2);

        // Diferencias entre las latitudes y longitudes
        double diferenciaLatitud = latitud2 - latitud1;
        double diferenciaLongitud = longitud2 - longitud1;

        // Fórmula de Haversine
        double a = Math.pow(Math.sin(diferenciaLatitud / 2), 2) +
                   Math.cos(latitud1) * Math.cos(latitud2) *
                   Math.pow(Math.sin(diferenciaLongitud / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calcula la distancia en kilómetros
        double distancia = RADIO_TIERRA_KM * c;

        return distancia;
    }
    
    public static void main(String[] args) {
        String address = "3 de febrero 315 rosario santa fe"; // Reemplaza con la dirección que desees
        String result = latitudLongitud(address);
        System.out.println(result);
        Double distancia = calcularDistancia(-32.954697,-60.62879839999999,-32.9537232,-60.6343032);
        System.out.println(distancia);
    }
    
}
