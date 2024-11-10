package proyectorestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicio_de_cocina {
    private List<Trabajador> trabajadores = new ArrayList<>();
    private List<String> inventario = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void gestionarCocina() {
        int opcion;
        do {
            System.out.println("\n*******Gestion de Cocina******");
            System.out.println("1. Ver Trabajadores");
            System.out.println("2. Ver Inventario");
            System.out.println("3. Agregar/Eliminar Ingredientes");
            System.out.println("4. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> verTrabajadores();
                case 2 -> verInventario();
                case 3 -> modificarInventario();
                case 4 -> System.out.println("Volviendo al Menu Principal...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }

    private void verTrabajadores() {
        System.out.println("\nTrabajadores en la Cocina:");
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores registrados.");
        } else {
            for (Trabajador trabajador : trabajadores) {
                System.out.println(trabajador);
            }
        }
    }

    private void verInventario() {
        System.out.println("\nInventario de Ingredientes:");
        if (inventario.isEmpty()) {
            System.out.println("El inventario esta vacio.");
        } else {
            for (String ingrediente : inventario) {
                System.out.println(ingrediente);
            }
        }
    }

    private void modificarInventario() {
        System.out.println("\nAgregar o Eliminar Ingredientes");
        System.out.println("1. Agregar Ingrediente");
        System.out.println("2. Eliminar Ingrediente");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el nombre del ingrediente: ");
                String ingrediente = scanner.nextLine();
                inventario.add(ingrediente);
                System.out.println("Ingrediente agregado.");
            }
            case 2 -> {
                System.out.print("Ingrese el nombre del ingrediente a eliminar: ");
                String ingrediente = scanner.nextLine();
                inventario.remove(ingrediente);
                System.out.println("Ingrediente eliminado.");
            }
            default -> System.out.println("Opcion no valida.");
        }
    }
}

