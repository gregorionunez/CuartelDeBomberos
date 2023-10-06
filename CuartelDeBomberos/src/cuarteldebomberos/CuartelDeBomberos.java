/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuarteldebomberos;

import AccesoADatos.BomberoData;
import Entidades.Bombero;
import java.time.LocalDate;
import java.util.ArrayList;

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

//        listaBomberos = bomberoData.listarBomberosSegunEstado(true);

        for (Bombero listaBombero : listaBomberos) {
            System.out.println(listaBombero.toString());
        }
        
        
        

    }

}
