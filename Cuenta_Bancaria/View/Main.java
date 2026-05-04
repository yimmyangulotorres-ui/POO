package view;

import domain.CuentaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = null;
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Número de cuenta: ");
                    String num = sc.nextLine();
                    System.out.print("Titular: ");
                    String nom = sc.nextLine();

                    double saldoInicial;
                    do {
                        System.out.print("Saldo inicial: ");
                        saldoInicial = sc.nextDouble();

                        if (saldoInicial < 0) {
                            System.out.println("❌ El saldo no puede ser negativo");
                        }

                    } while (saldoInicial < 0);

                    cuenta = new CuentaBancaria(num, nom, saldoInicial);
                    System.out.println("Cuenta creada");
                    break;

                case 2:
                    if (cuenta == null) {
                        System.out.println("Primero cree una cuenta");
                        break;
                    }
                    double deposito;
                    do {
                        System.out.print("Monto a depositar: ");
                        deposito = sc.nextDouble();

                        if (deposito <= 0) {
                            System.out.println("Monto inválido");
                        }

                    } while (deposito <= 0);

                    cuenta.depositar(deposito);
                    break;

                case 3:
                    if (cuenta == null) {
                        System.out.println("Primero cree una cuenta");
                        break;
                    }

                    double retiro;

                    do {
                        System.out.print("Monto a retirar: ");
                        retiro = sc.nextDouble();

                        if (retiro <= 0) {
                            System.out.println("❌ Monto inválido");
                        } else if (retiro > cuenta.getSaldo()) {
                            System.out.println("❌ Saldo insuficiente. Saldo actual: " + cuenta.getSaldo());
                        }

                    } while (retiro <= 0 || retiro > cuenta.getSaldo());

                    cuenta.retirar(retiro);
                    break;

                case 4:
                    if (cuenta != null) {
                        cuenta.consultar();
                    } else {
                        System.out.println("No existe cuenta");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }
}
