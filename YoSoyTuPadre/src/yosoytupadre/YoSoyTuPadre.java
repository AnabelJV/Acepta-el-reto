/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yosoytupadre;

import java.util.Scanner;

/**
 *
 * @author anavil
 */
public class YoSoyTuPadre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("¿Cuantos casos de prueba?");
         int pruebas = sc.nextInt();
         sc.nextLine();
         
         for ( int i=0; i<=pruebas; i++ )
         {
             System.out.println("Introduce un nombre");
             String nombre = sc.nextLine();
             
             System.out.println("Introduce otro nombre");
             String nombre2 = sc.nextLine();
             
             if ( nombre.equals("Luke") && nombre2.equals("padre"))
             {
                 System.out.println("TOP SECRET");
             }
             else
             {
                 System.out.println(nombre + "," + " yo soy tu " + nombre2);
             }
         }
        
    }
    
}
