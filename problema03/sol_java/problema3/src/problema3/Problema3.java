/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * /**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tipo;
        String nombre;
        int horas_t;
        double cuota_hora;
        int horasextra;
        double cuota_horasextra;
        double sueldo;

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Que tipo de empleado es usted (1, 2, 3, 4):");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas_t = entrada.nextInt();
        System.out.println("Cuanto es su cuota por hora: ");
        cuota_hora = entrada.nextDouble();

        if (horas_t > 40) {
            if (tipo == 1) {
                cuota_hora = cuota_hora * 1.5;
                horasextra = horas_t - 40;
                cuota_horasextra = cuota_hora * horasextra;
                sueldo = horas_t * cuota_hora + cuota_horasextra;
                System.out.printf("El nombre del empleado es: %s\n"
                        + "Con %d horas trabajadas\nSu cuota/hora es de: %.2f\n"
                        + "Su sueldo a pagar es de: %.2f\n",
                        nombre, horas_t, cuota_hora, sueldo);
            }
            if (tipo == 2) {
                cuota_hora = cuota_hora * 2;
                horasextra = horas_t - 40;
                cuota_horasextra = cuota_hora * horasextra;
                sueldo = horas_t * cuota_hora + cuota_horasextra;
                System.out.printf("El nombre del empleado es: %s\n"
                        + "Con %d horas trabajadas\nSu cuota/hora es de: %.2f\n"
                        + "Su sueldo a pagar es de: %.2f\n",
                        nombre, horas_t, cuota_hora, sueldo);
            }
            if (tipo == 3) {
                cuota_hora = cuota_hora * 2.5;
                horasextra = horas_t - 40;
                cuota_horasextra = cuota_hora * horasextra;
                sueldo = horas_t * cuota_hora + cuota_horasextra;
                System.out.printf("El nombre del empleado es: %s\n"
                        + "Con %d horas trabajadas\nSu cuota/hora es de: %.2f\n"
                        + "Su sueldo a pagar es de: %.2f\n",
                        nombre, horas_t, cuota_hora, sueldo);
            }
            if (tipo == 4) {
                cuota_hora = cuota_hora * 3;
                horasextra = horas_t - 40;
                cuota_horasextra = cuota_hora * horasextra;
                sueldo = horas_t * cuota_hora + cuota_horasextra;
                System.out.printf("El nombre del empleado es: %s\n"
                        + "Con %d horas trabajadas\nSu cuota/hora es de: %.2f\n"
                        + "Su sueldo a pagar es de: %.2f\n",
                        nombre, horas_t, cuota_hora, sueldo);
              
            }
        } else {
            sueldo = horas_t * cuota_hora;
           System.out.printf("El nombre del empleado es: %s\n"
                        + "Con %d horas trabajadas\nSu cuota/hora es de: %.2f\n"
                        +"Su sueldo a pagar es de: %.2f\n",
                    nombre, horas_t, cuota_hora, sueldo);    
        }
    }
}

/* }
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
            

        }   */
