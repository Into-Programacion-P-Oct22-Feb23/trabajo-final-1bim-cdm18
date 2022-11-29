/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * /**
 *
 * @author Usuario
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int a;
        int b;
        int c;
        int mayor;

        System.out.println("Ingrese el primer numero: ");
        a = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        c = entrada.nextInt();
        mayor = 0;
            if (a > b & a > c) {
                mayor = a;
                System.out.println("El numero mayor es: " + mayor);
        }
            if (b > a & b > c) {
                mayor = b;
                System.out.println("El numero mayor es: " + mayor);
        }
            if (c > a & c > a) {
                mayor = c;
                System.out.println("El numero mayor es: " + mayor);
        }
        System.out.println("Error, hay numeros iguales");

    }
}



