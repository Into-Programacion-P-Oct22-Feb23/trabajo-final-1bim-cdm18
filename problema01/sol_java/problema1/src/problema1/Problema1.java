/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * /**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int A;
        int B;
        int C;
        System.out.println("Ingrese el valor del angulo A del triangulo:");
        A = entrada.nextInt();
        System.out.println("Ingrese el valor del angulo B del triangulo:");
        B = entrada.nextInt();
        System.out.println("Ingrese el valor del angulo C del triangulo:");
        C = entrada.nextInt();

        if (A == 90 || B == 90 || C == 90) {
            System.out.println("El valor de angulos ingresados son: " + A + ", " + B + 
                    ", " + C );
            System.out.println ("Por ende, este triangulo es rectangulo "
                    + "(posee un angulo igual a 90 grados)");

        }
        
        if (A > 90 && A < 180 || B > 90 && B < 180 || C > 90 && C < 180) {
            System.out.println("El valor de angulos ingresados son: " + A + ", " + B + 
                    ", " + C );
            System.out.println ("Por ende, este triangulo es obtusangulo "
                    + "(posee un mayor a 90 grados y menor a 180 grados)");                    
            
        }
        if (A < 90  && B < 90 && C < 90) {
            System.out.println("El valor de angulos ingresados son: " + A + ", " + B + 
                    ", " + C );
            System.out.println ("Por ende, este triangulo es acutangulo "
                    + "(posee todos sus angulos menores a 90 grados)");          
            
            
        }
    }
}