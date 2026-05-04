package org.example.View;

import java.util.Scanner;
import org.example.Matematicas.Fraccion;

public class FraccionEjecutar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fraccion f1 = null;
        Fraccion f2 = null;

        while (f1 == null) {
            try {
                System.out.println("Primera Fraccion");
                System.out.print("Numerador: ");
                int n1 = sc.nextInt();
                System.out.print("Denominador: ");
                int d1 = sc.nextInt();

                f1 = new Fraccion(n1, d1);

            } catch (IllegalArgumentException e) {
                System.out.println(" Error: " + e.getMessage());
                System.out.println("Intenta nuevamente...\n");
            }
        }

        while (f2 == null) {
            try {
                System.out.println("=== Segunda Fraccion ===");
                System.out.print("Numerador: ");
                int n2 = sc.nextInt();
                System.out.print("Denominador: ");
                int d2 = sc.nextInt();

                f2 = new Fraccion(n2, d2);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Intenta nuevamente...\n");
            }
        }

        // =========================
        // RESULTADOS
        // =========================
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);

        System.out.println("\nDecimal f1: " + f1.valorDecimal());
        System.out.println("Decimal f2: " + f2.valorDecimal());

        System.out.println("\nSuma: " + f1.sumar(f2));
        System.out.println("Resta: " + f1.restar(f2));
        System.out.println("Multiplicación: " + f1.multiplicar(f2));

        // División con control de error
        try {
            System.out.println("División: " + f1.dividir(f2));
        } catch (ArithmeticException e) {
            System.out.println("Error en división: " + e.getMessage());
        }

        // Inversas con control de error
        try {
            System.out.println("\nInversa de f1: " + f1.inversa());
        } catch (ArithmeticException e) {
            System.out.println("Error en inversa f1: " + e.getMessage());
        }

        try {
            System.out.println("Inversa de f2: " + f2.inversa());
        } catch (ArithmeticException e) {
            System.out.println("Error en inversa f2: " + e.getMessage());
        }

        sc.close();
    }
}
