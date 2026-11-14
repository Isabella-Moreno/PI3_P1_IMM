package Ejercicio3;

public class UsoIncorrectoAbstractaPrueba {

    public void iniciar() {
        // --- CASO 1: INSTANCIAR DIRECTAMENTE UNA CLASE ABSTRACTA ---
        // Descomenta la siguiente línea para observar el error de compilación:
        // Error: 'Instrumento' is abstract; cannot be instantiated
        // Instrumento inst = new Instrumento("Piano");

        // --- CASO 2: MÉTODO CONCRETO QUE DEBIÓ SER ABSTRACTO ---
        Instrumento guitarra = new Guitarra();
        guitarra.tocar();

        System.out.println("\n--- ANÁLISIS EJERCICIO 3 ---");
        System.out.println("1. Instanciación directa: Java prohíbe crear objetos con 'new' de una clase abstracta "
                + "porque está incompleta por diseño y solo sirve como plantilla base.");
        System.out.println("2. Método concreto en lugar de abstracto: Si un comportamiento varía en cada subclase "
                + "(como 'tocar()') y se define concreto en la clase padre, el compilador no exige sobrescribirlo, "
                + "permitiendo que las subclases hereden comportamientos genéricos o erróneos sin advertencia.");
    }
}