package Ejercicio2;

import java.util.Scanner;

public class EmpleadoPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre del Gerente: ");
        String nomGerente = sc.nextLine();
        System.out.print("Salario base del Gerente: ");
        double salGerente = sc.nextDouble();
        System.out.print("Bono de gestión: ");
        double bono = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer

        System.out.print("\nNombre del Vendedor: ");
        String nomVendedor = sc.nextLine();
        System.out.print("Salario base del Vendedor: ");
        double salVendedor = sc.nextDouble();
        System.out.print("Comisión por ventas: ");
        double comision = sc.nextDouble();

        Empleado gerente = new Gerente(nomGerente, salGerente, bono);
        Empleado vendedor = new Vendedor(nomVendedor, salVendedor, comision);

        System.out.println("\n--- NÓMINA DE EMPLEADOS ---");
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}