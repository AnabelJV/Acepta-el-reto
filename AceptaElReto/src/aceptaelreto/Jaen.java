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
        int tamañoMaximo=0;
        
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
            
             for (int i = 0; i < f; i++) {
                 
                for (int j = 0; j < c; j++) {
                    
                    if( matriz[i][j] == '#' ) {
                        
                        int tamaño = tPlantacion(matriz, i, j); 
                        if(tamaño>tamañoMaximo) {
                           
                            tamañoMaximo=tamaño;
                        }
                    }
                }
             }
             
             System.out.println(tamañoMaximo);
        }
    }
    
    public static int tPlantacion(char matriz[][], int f, int c) {
        
       int tamaño = 0;
        
       if (f < 0 || c < 0 || f >= matriz.length || c >= matriz[0].length) {
           
           return 0;
        }
       
       if ( matriz[f][c] == ' ') {
        
           return 0;
       }
       
       if ( matriz[f][c] == '#'){
    
           matriz[f][c] = ' ';
            
           tamaño++;
            
           //Derecha
           tamaño += tPlantacion(matriz, f + 1, c);
           //Izquierda
           tamaño += tPlantacion(matriz, f - 1, c);
           //Arriba
           tamaño += tPlantacion(matriz, f, c + 1);
           //Abajo
           tamaño += tPlantacion(matriz, f, c - 1);
           
           return tamaño;
        }
       
          return 0;
    }  
}


        
   
       
        
        

    