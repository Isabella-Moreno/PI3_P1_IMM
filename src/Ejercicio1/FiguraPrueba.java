package Ejercicio1;

import java.util.Scanner;

public class FiguraPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        Figura circulo = new Circulo(radio);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();
        Figura rectangulo = new Rectangulo(base, altura);

        System.out.println("\n--- CÁLCULO DE ÁREAS ---");
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}