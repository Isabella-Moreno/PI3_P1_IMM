package Ejercicio3;

public abstract class Instrumento {

    protected String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    // MALA PRÁCTICA: Definir como concreto un método que cada subclase DEBE implementar distinto.
    // Al no ser 'abstract', Java no obliga a las subclases a sobrescribirlo.
    public void tocar() {
        System.out.println("El instrumento " + nombre + " emite un sonido genérico sin definir.");
    }
}