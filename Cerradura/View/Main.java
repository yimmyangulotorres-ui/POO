package edu.unl.cc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cerraduraElectronica cerradura = new cerraduraElectronica();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Configurar clave");
            System.out.println("2. Ingresar clave");
            System.out.println("3. Ver estado");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nueva clave (4 dígitos): ");
                    Integer nuevaClave = sc.nextInt();
                    cerradura.configurarClave(nuevaClave);
                    break;

                case 2:
                    System.out.print("Ingrese clave: ");
                    Integer clave = sc.nextInt();
                    cerradura.validarClave(clave);
                    break;

                case 3:
                    if (cerradura.estaBloqueada()) {
                        System.out.println("Estado: BLOQUEADA");
                    } else {
                        System.out.println("Estado: ACTIVA");
                    }
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
