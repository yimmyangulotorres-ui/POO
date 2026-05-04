package edu.unl.cc.fundamento.math.domain;

public class EcuacionCuadratica {

    private double a;
    private double b;
    private double c;

    // Constructor
    public EcuacionCuadratica(double a, double b, double c) {
        validateA(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Validación
    private void validateA(double a) {
        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente 'a' no puede ser 0.");
        }
    }

    // Discriminante
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Raíces reales
    public double[] getRaicesReales() {
        double D = getDiscriminante();
        if (D < 0) return null;

        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);

        return new double[]{x1, x2};
    }

    // Raíces complejas
    public double[] getRaicesComplejas() {
        double D = getDiscriminante();
        if (D >= 0) return null;

        double real = -b / (2 * a);
        double imag = Math.sqrt(-D) / (2 * a);

        return new double[]{real, imag};
    }

    // Tipo de solución
    public String getTipoSolucion() {
        double D = getDiscriminante();

        if (D > 0) return "RAICES REALES DIFERENTES";
        if (D == 0) return "RAIZ DOBLE";
        return "RAICES COMPLEJAS";
    }

    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }

    // Getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
}
