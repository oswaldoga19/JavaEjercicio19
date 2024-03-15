/*
 * Dado el valor del lado en un triángulo equilátero, 
   haga un algoritmo que obtenga el perímetro, el valor de la altura y el área del triángulo.
 */
package javaejercicio19;

import java.util.Scanner;


public class JavaEjercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese la longitud del lado del triángulo equilátero:");
        double lado = scanner.nextDouble();

        // Cálculo del perímetro
        double perimetro = 3 * lado;

        // Cálculo de la altura
        double altura = (lado * Math.sqrt(3)) / 2;

        // Cálculo del área
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        // Mostrar resultados
        System.out.println("\nEl resultados para el triángulo equilátero es:");
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);

    }
    
}
