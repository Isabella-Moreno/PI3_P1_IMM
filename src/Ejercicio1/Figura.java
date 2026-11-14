package Ejercicio1;

public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.printf("El área de %s es: %.2f%n", nombre, calcularArea());
    }
}