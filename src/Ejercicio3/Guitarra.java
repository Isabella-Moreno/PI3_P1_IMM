package Ejercicio3;

public class Guitarra extends Instrumento {

    public Guitarra() {
        super("Guitarra Acústica");
    }

    // Como tocar() es concreto en Instrumento, el compilador NO obliga a implementarlo aquí,
    // provocando que la guitarra herede un comportamiento genérico incorrecto.
}