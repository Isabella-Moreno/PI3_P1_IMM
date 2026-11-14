package Ejercicio2;

public class Vendedor extends Empleado {

    private double comisionVentas;

    public Vendedor(String nombre, double salarioBase, double comisionVentas) {
        super(nombre, salarioBase);
        this.comisionVentas = comisionVentas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comisionVentas;
    }
}