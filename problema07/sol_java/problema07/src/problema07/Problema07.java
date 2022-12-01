/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero;
        int suma_par = 2;
        int suma_total = 0;
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        if (numero>=2){
            if (numero%2==0){
                System.out.println("El numero ingresado es Par");
                while(suma_par <= numero){
                    suma_total = suma_total + suma_par ;
                    System.out.println(suma_par);
                    suma_par = suma_par + 2;                    
                }
                System.out.println("La suma total es: " + suma_total);    
            }        
        } else 
             System.out.println("Error, ingrese un valor mas alto");

    }
    
}
