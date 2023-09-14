/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4j;
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica4J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad en pesos ");
        int pesos = scanner.nextInt();
        final double precioDolar = 17.5;
        final double precioEuro = 18.2;
        
        scanner.close();
        
           double dolares = (pesos / precioDolar);
        double Euros = (pesos / precioEuro);
        
        System.out.println("Tu cantidad en dolares es " + dolares);
        System.out.println("Tu cantidad en euros es " + Euros);
        
    }
    
}
