/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * /**
 *
 * @author Usuario
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int x;
        int y;
        
        System.out.println("Ingrese la cordenada x: ");
        x = entrada.nextInt();
        System.out.println("Ingrese la cordenada y: ");
        y = entrada.nextInt();
        
        if (x > 0 && y > 0){
            System.out.println("Sus cordenadas estan en el primer cuadrante ");        
        }
        if (x > 0 && y < 0){
            System.out.println("Sus cordenadas estan en el cuarto cuadrante ");        
        }
        if (x < 0 && y < 0){
            System.out.println("Sus cordenadas estan en el tercer cuadrante ");        
        }
        if (x < 0 && y > 0){
            System.out.println("Sus cordenadas estan en el segundo cuadrante ");        
        }
        if (x == 0 && y == 0){
            System.out.println("Sus cordenadas estan centro "); 
            
        }
        if (x == 0 && y > 0){
            System.out.println("Sus cordenadas estan en el eje +Y ");             
        }
        if (x == 0 && y < 0){
            System.out.println("Sus cordenadas estan en el eje -Y ");             
        }
        if (x < 0 && y == 0){
            System.out.println("Sus cordenadas estan en el eje -X ");             
        }
        if (x > 0 && y == 0){
            System.out.println("Sus cordenadas estan en el eje +X ");             
        }
    }    
}



