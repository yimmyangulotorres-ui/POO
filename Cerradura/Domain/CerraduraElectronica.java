package edu.unl.cc;

public class CerraduraElectronica {

    private Integer clave;
    private int intentosFallidos;
    private boolean bloqueada;

    public cerraduraElectronica() {
        this.intentosFallidos = 0;
        this.bloqueada = false;
    }

    public void configurarClave(Integer nuevaClave) {
        if (nuevaClave >= 1000 && nuevaClave <= 9999) {
            this.clave = nuevaClave;
            System.out.println("Clave configurada correctamente.");
        } else {
            System.out.println("Error: La clave debe tener 4 dígitos.");
        }
    }

    public boolean validarClave(Integer claveIngresada) {
        if (bloqueada) {
            System.out.println("La cerradura está bloqueada.");
            return false;
        }

        if (clave != null && clave.equals(claveIngresada)) {
            System.out.println("Acceso permitido.");
            intentosFallidos = 0;
            return true;
        } else {
            intentosFallidos++;
            System.out.println("Clave incorrecta.");

            if (intentosFallidos >= 3) {
                bloqueada = true;
                System.out.println("Cerradura bloqueada por 3 intentos fallidos.");
            }
            return false;
        }
    }

    public boolean estaBloqueada() {
        return bloqueada;
    }
}
