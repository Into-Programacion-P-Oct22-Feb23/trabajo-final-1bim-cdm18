/*
Utilizando una estructura repetitiva diseñe un algoritmo para calcular e imprimir los k primeros términos de la serie:
S1 = 12−11+24−22+36−33+48−44
 */
package problema09;

/**
 *
 * @author Oliver Saraguro - Daniel Mejia
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables      
        int contador = 12;
        int auxiliar = 11;
        String salida = "";
        int cont2 = 1;
        //Ciclo repetitivo
        while(contador <= 48){
            salida = salida + contador + "-" + auxiliar ;
            if (cont2 <4){
            salida = salida + '+';
            cont2 = cont2 + 1;
            }
            contador = contador + 12;
            auxiliar = auxiliar + 11;
        }
        
        System.out.printf("S1 = %s\n", salida);
    }
    
}
