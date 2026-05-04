package edu.unl.cc.fundamento.math.view;

import edu.unl.cc.fundamento.math.domain.EcuacionCuadratica;
import java.util.Scanner;

public class EcuacionExecutor {

    private Scanner sc = new Scanner(System.in);

    public void ejecutar() {

        int opcion;
        EcuacionCuadratica ecuacion = null;

        do {
            System.out.println("\n--- MENÚ ECUACIÓN CUADRÁTICA ---");
            System.out.println("1. Ingresar coeficientes");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    ecuacion = ingresarDatos();
                    break;

                case 2:
                    mostrarResultados(ecuacion);
                    break;

                case 3:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }

    private EcuacionCuadratica ingresarDatos() {
        try {
            System.out.print("Ingrese a: ");
            double a = sc.nextDouble();

            System.out.print("Ingrese b: ");
            double b = sc.nextDouble();

            System.out.print("Ingrese c: ");
            double c = sc.nextDouble();

            return new EcuacionCuadratica(a, b, c);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private void mostrarResultados(EcuacionCuadratica ecuacion) {

        if (ecuacion == null) {
            System.out.println("Primero debe ingresar coeficientes válidos.");
            return;
        }

        System.out.println("\nEcuación: " + ecuacion);
        System.out.println("Tipo: " + ecuacion.getTipoSolucion());

        double[] reales = ecuacion.getRaicesReales();
        double[] complejas = ecuacion.getRaicesComplejas();

        if (reales != null) {
            System.out.println("x1 = " + reales[0]);
            System.out.println("x2 = " + reales[1]);
        } else {
            System.out.println("x1 = " + complejas[0] + " + " + complejas[1] + "i");
            System.out.println("x2 = " + complejas[0] + " - " + complejas[1] + "i");
        }
    }
