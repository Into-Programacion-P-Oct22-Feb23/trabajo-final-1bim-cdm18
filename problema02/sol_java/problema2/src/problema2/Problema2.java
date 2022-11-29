/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * /**
 *
 * @author Usuario
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

       
        double descuento;
        double total;
        double precio_u;
        int trajes;
        double subtotal;
        
        System.out.println("Ingrese la cantidad de trajes que va a adquirir");
        trajes = entrada.nextInt();
        System.out.println("Ingrese el valor unitario de los trajes");
        precio_u = entrada.nextDouble();
        
        subtotal = trajes * precio_u;
                
        if (trajes == 1) {
            descuento = subtotal * 0.20;
            total = subtotal - descuento;          
            System.out.printf("El subtotal a pagar es de: %.2f\nCon un descuento de: %.2f\nSu total es de: %.2f\n",
                    subtotal, descuento, total);
            

        }
        if (trajes == 2) {
            
            descuento = subtotal * 0.25;
            total = subtotal - descuento;          
            System.out.printf("El subtotal a pagar es de: %.2f\nCon un descuento de: %.2f\nSu total es de: %.2f\n",
                    subtotal, descuento, total);
            

        }
        if (trajes == 3) {
            
            descuento = subtotal * 0.40;
            total = subtotal - descuento;          
            System.out.printf("El subtotal a pagar es de: %.2f\nCon un descuento de: %.2f\nSu total es de: %.2f\n",
                    subtotal, descuento, total);
            

        }
        if (trajes > 3) {
            
            descuento = subtotal * 0.50;
            total = subtotal - descuento;          
            System.out.printf("El subtotal a pagar es de: %.2f\nCon un descuento de: %.2f\nSu total es de: %.2f\n",
                    subtotal, descuento, total);
            

        }           
            
       
    }
}