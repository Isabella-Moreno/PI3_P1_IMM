package Ejercicio2;

public abstract class Empleado {

    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.printf("Empleado: %s | Salario Total: $%.2f%n", nombre, calcularSalario());
    }
}