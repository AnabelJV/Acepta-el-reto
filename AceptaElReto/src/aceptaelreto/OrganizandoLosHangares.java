/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Nakanne37
 */
public class OrganizandoLosHangares {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Introduce el nº de hangares: ");
        int numhangares = sc.nextInt();
        int hangares [] =new int [numhangares];
      
        int naves [];
        int numnaves;


        while ( numhangares != 0 ) {
            
            for ( int i = 0; i < numhangares; i++ ) {
                
                //System.out.println("Introduce el nº de espacios vacios en el hangar: ");
                hangares[i] = sc.nextInt();
            }
            
            //System.out.println("Introduce el nº de naves: ");
            numnaves = sc.nextInt();
            naves = new int[numnaves];

            for ( int i = 0; i < numnaves; i++ ) {
                
                //System.out.println("Introduce el tamaño de la nave: ");
                naves[i] = sc.nextInt();
            }

            boolean r = resuelvecaso(hangares, naves);
            if ( r == true ) {
                
                System.out.println("SI");
            } else {
                
                System.out.println("NO");
            }
            
            //System.out.println("Introduce nº de hangares: ");
            numhangares = sc.nextInt();
        }
    }
    
    public static boolean resuelvecaso(int [] hangares, int [] naves) {
         
        for ( int i = 0; i < naves.length; i++ ) {           
           
            int phangar = hangarMayor(hangares);
            if (naves[i] <= hangares[phangar]) {
                
                hangares[phangar] = hangares[phangar] - naves[i];
            } else {
                
                return false;
            }
        }
        return true;
    }

    public static int hangarMayor(int [] hangares) {
        
        int p = 0;
        
        for ( int i = 0; i < hangares.length; i++ ) {
            
            if ( hangares[i] > hangares[p] ) {
                p = i;
            }
        }
        return p;
    }

}
