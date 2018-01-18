
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anavil
 */
public class TendenciaAlLadoOscuro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos casos de prueba?");
        int pruebas = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j <= pruebas - 1; j++) {
            
            System.out.println("Introduce un numero: ");
            String s1 = sc.nextLine();
            
            String num = base10to5(s1);
            
            int c = cuantos4(num);
            
            if ( c==1 ) {
                
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    public static String base10to5( String n ) { 

        int n1 = Integer.parseInt(n, 10);
        //System.out.println(n + " es " + n1 + " en base10");

        String s2 = Integer.toString(n1, 5);
        //System.out.println(n1 + " es " + s2 + " en base5");
        
        return s2;
    }
    
    public static int cuantos4 ( String s ){
        
        int contador=0;
        int c4 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            char l = s.charAt(i);

            if (l == '4') {
            
                contador ++;
            }
           
        }
        
         if ( contador>=2 )
            {
                c4 = 1;
            }
            else {
                c4 = 0;
            }
         return c4;
    }
}
