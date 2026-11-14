package Ejercicio2;

public class Gerente extends Empleado {

    private double bonoGestion;

    public Gerente(String nombre, double salarioBase, double bonoGestion) {
        super(nombre, salarioBase);
        this.bonoGestion = bonoGestion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonoGestion;
    }
}