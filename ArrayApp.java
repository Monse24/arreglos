/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String[] abecedario = {"a", "b", "c", "d"};
        System.out.println("longitud= " + abecedario.length);
        System.out.println("letra 3= " + abecedario[2]);*/

 /*String[] comidas = new String[5];
        System.out.println("longitud= " + comidas.length);
        System.out.println("letra 0= " + comidas[0]);
        System.out.println("letra 3= " + comidas[3]);
        comidas[0] = "Mole";
        comidas[1] = "Pozole";
        comidas[2] = "Enchiladas";
        comidas[3] = "Guajolotes";
        comidas[4] = "Nopales";
        System.out.println("comidas[3]= " + comidas[3]);*/
        float[] costos = new float[3];
        System.out.println("longitud= " + costos.length);
        System.out.println("costos 0= " + costos[0]);
        System.out.println("costos 2= " + costos[2]);
        costos[0] = (float) 10.56;
        costos[1] = (float) 89.36;
        costos[2] = (float) 40.97;
        System.out.println("costos[2]= " + costos[2]);

        float[] costos1 = {(float)10.56,(float)89.46,(float)56.41,(float)167.41};
        System.out.println("longitud = " + costos1.length);
        System.out.println("elementos[2] = "+ costos1[2]);
        
        ArrayList<Prueba> p1=new ArrayList<Prueba>();
        Prueba prueba1=new Prueba(1,"AC");
        p1.add(prueba1);
        Prueba prueba2=new Prueba(2,"BA");
        p1.add(prueba2);
        Prueba prueba3=new Prueba(3,"PR");
        p1.add(prueba3);
        System.out.println("longitud de arreglo de objetos: " + p1.size());
        System.out.println("datos del objeto 1: " + p1.get(2).getEstatus());
        
    }

}
