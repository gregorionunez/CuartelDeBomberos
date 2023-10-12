/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuarteldebomberos;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Emergencia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gregorio
 */
public class CuartelDeBomberos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRUEBAS PARA BOMBERO DATA
        /*
        LocalDate fecha = LocalDate.now();
        Bombero bombero1 = new Bombero(10, "Marcelo", "Pepe", fecha, "1150505050", 1, "ORH+", true);
        Bombero bombero2 = new Bombero(11, "Fabian", "Pipo", fecha, "1150505050", 3, "ORH-", true);
        Bombero bombero3 = new Bombero();
        System.out.println(bombero1.toString());
        System.out.println(bombero2.toString());
        BomberoData bomberoData = new BomberoData();
        bomberoData.agregarBombero(bombero1);
        //bomberoData.agregarBombero(bombero2);
        //bomberoData.eliminarBombero(3);

        ArrayList<Bombero> listaBomberos = new ArrayList();

        listaBomberos = bomberoData.listarBomberosSegunEstado(true);

        for (Bombero listaBombero : listaBomberos) {
            System.out.println(listaBombero.toString());
        }
         */
        //PRUEBAS PARA CUARTEL DATA
        /*Cuartel bomberosDeQuilmes = new Cuartel("Bomberos De Quilmes", "Quilmes", 42, 25, "1515", "quilmes@gmail", true);
        Cuartel bomberosDeMDP = new Cuartel("Bomberos De Mar Del Plata", "MDP", 12, 35, "1515", "mdl@gmail", true);
        Cuartel bomberosDeRosario = new Cuartel("Bomberos De Rosario", "Rosario", 12, 95, "1515", "rosario@gmail", true);
        Cuartel bomberosDeAdrogue = new Cuartel("Bomberos De Adrogue", "Adrogue", 8, 17, "1515", "adrogue@gmail", true);
        System.out.println(bomberosDeQuilmes.toString());
        System.out.println(bomberosDeAdrogue.toString());
        CuartelData cuartelData = new CuartelData();*/
        //cuartelData.agregarCuartel(bomberosDeMDP);
        //cuartelData.agregarCuartel(bomberosDeQuilmes);
        //cuartelData.agregarCuartel(bomberosDeRosario);
        //cuartelData.agregarCuartel(bomberosDeAdrogue);
      /*  ArrayList<Cuartel> listaDeCuarteles = new ArrayList<>();
        listaDeCuarteles = cuartelData.listarCuarteles();
        for (Cuartel listaDeCuartele : listaDeCuarteles) {
            System.out.println(listaDeCuartele.toString());
        }
        System.out.println("ORDENO SEGUN UNA CORDENADA");

        HashMap<Integer,Cuartel> listaDeCuartelesOrden = new HashMap();
        listaDeCuartelesOrden=cuartelData.listarCuartelesCercanos(12, 95);
        
        for (Map.Entry<Integer, Cuartel> entry : listaDeCuartelesOrden.entrySet()) {
            Integer key = entry.getKey();
            Cuartel value = entry.getValue();
            System.out.println("Posicion: "+key);
            System.out.println(value.toString());
            
        }*/

    }

}
