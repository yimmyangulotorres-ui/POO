package org.example.Matematicas;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }


    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.denominador = denominador;
    }

    // Mostrar como fracción
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Valor decimal
    public double valorDecimal() {
        return (double) numerador / denominador;
    }

    // Máximo común divisor (Euclides)
    private int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }

    // Simplificar
    public void simplificar() {
        int mcd = mcd(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;

        // Evitar denominador negativo
        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }
    }

    // Inversa
    public Fraccion inversa() {
        if (numerador == 0) {
            throw new ArithmeticException("No se puede invertir una fracción con numerador 0");
        }
        return new Fraccion(denominador, numerador);
    }

    // Suma
    public Fraccion sumar(Fraccion f) {
        int num = this.numerador * f.denominador + f.numerador * this.denominador;
        int den = this.denominador * f.denominador;
        return new Fraccion(num, den);
    }

    // Resta
    public Fraccion restar(Fraccion f) {
        int num = this.numerador * f.denominador - f.numerador * this.denominador;
        int den = this.denominador * f.denominador;
        return new Fraccion(num, den);
    }

    // Multiplicación
    public Fraccion multiplicar(Fraccion f) {
        int num = this.numerador * f.numerador;
        int den = this.denominador * f.denominador;
        return new Fraccion(num, den);
    }

    // División
    public Fraccion dividir(Fraccion f) {
        if (f.numerador == 0) {
            throw new ArithmeticException("No se puede dividir entre una fracción con numerador 0");
        }
        int num = this.numerador * f.denominador;
        int den = this.denominador * f.numerador;
        return new Fraccion(num, den);
    }
}
