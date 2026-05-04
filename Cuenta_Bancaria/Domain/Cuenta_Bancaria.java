package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<String> historial) {
        this.historial = historial;
    }

    private double saldo;
    private ArrayList<String> historial;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial){
        this.numeroCuenta= numeroCuenta;
        this.titular= titular;
        this.saldo= saldoInicial;
        this.historial= new ArrayList<>();
        historial.add("Cuenta creada con saldo inicial: " + saldoInicial);

    }

    public void depositar(double monto){
        saldo += monto;
        historial.add("Deposito: +" + saldo);
        System.out.println("Saldo Depositado Correctamente: Saldo Actual " + saldo + "$");
    }

    public void retirar(double monto){

        do{
            if (monto > saldo) {
                System.out.println("Saldo Insuficiente: El valor excede el saldo registrado" + saldo + "$");
            }
        }while(monto > saldo);

        saldo -= monto;
        historial.add("Retiro: -" + saldo);
        System.out.println("Saldo Retirado Correctamente: Saldo Actual " + saldo + "$");
    }

    public void consultar(){
        System.out.println("\n Datos de la Cuenta Registrada");
        System.out.println("Numero de Cuenta" + numeroCuenta);
        System.out.println("Titular" + titular);
        System.out.println("Saldo" + saldo);

        System.out.println("\n HISTORIAL:");
        for(String h: historial){
            System.out.println("- " + h);
        }
    }
}
