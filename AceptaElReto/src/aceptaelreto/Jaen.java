/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author anavil
 */
public class Jaen {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int f;
        int c;
        
        while ( sc.hasNext()) {
        
            //Nº filas y columnas
            f = sc.nextInt();
            c = sc.nextInt();
            sc.nextLine();
            
            char [][] matriz = new char [f][c];
        
            //Inicializamos la matriz
            for ( int i=0; i<f; i++ ) {
            
                String olivos = sc.nextLine();
                
                //matriz[i] = sc.nextLine().toCharArray();
            
                for ( int j=0; j<olivos.length(); j++ ) {
                    
                    matriz [i][j] = olivos.charAt(j);
                }
            }
            
            int tamaño = tPlantacion(matriz, f, c);
        }
        
     }
    
    public static int tPlantacion(char matriz[][], int f, int c) {
        
       if ( matriz[0][0] != '#') {
        
           return 0;
       }
       
       if ( matriz[f][c] == '#'){
    
            return 1 + tPlantacion(matriz, f-1, c);
        }
       else {
           
           return 1 + tPlantaciones(matriz, );
        }
       
       
    }
    
}
