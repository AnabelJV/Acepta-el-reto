/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author anavil
 */
public class EscapandoDeLasFuerzasImperiales {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nº de filas: ");
        int filas = sc.nextInt();
        
        System.out.println("Introduce el nº de columnas: ");
        int col = sc.nextInt();
        
        char [][] matriz = new char [filas][col];
        
        for ( int i=0; i<filas; i++ ) {
            
            String l = sc.nextLine();
            
            for ( int j=0; j<col; j++ ) {
                
                matriz[i][j] = l.charAt(j);
            }
        }
        
        imprimirMapa(filas, col, matriz);
    }
    
    public static void imprimirMapa ( int f, int c, char matriz [][]) {
        
        for ( int i=0; i<f; i++ ) {
        
            for ( int j=0; j<c; j++ ) {
             
                System.out.print(matriz [i][j]);
                System.out.print(" ");
            }
            System.out.print("/n");
        }
        
    }
}
