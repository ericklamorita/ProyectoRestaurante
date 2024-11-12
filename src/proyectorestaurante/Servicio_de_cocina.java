package proyectorestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicio_de_cocina {
    private GestionTrabajadores gestionTrabajadores;
    private List<String> inventario;
    private Scanner scanner;

    public Servicio_de_cocina() {
        gestionTrabajadores = new GestionTrabajadores();
        inventario = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void gestionarCocina() {
        int opcion;
        do {
            System.out.println("\n******* Gestion de Cocina ******");
            System.out.println("1. Ver Trabajadores");
            System.out.println("2. Contratar Trabajador");
            System.out.println("3. Despedir Trabajador");
            System.out.println("4. Ver Inventario");
            System.out.println("5. Agregar/Eliminar Ingredientes");
            System.out.println("6. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> gestionTrabajadores.mostrarTrabajadores();
                case 2 -> contratarTrabajador();
                case 3 -> despedirTrabajador();
                case 4 -> verInventario();
                case 5 -> modificarInventario();
                case 6 -> System.out.println("Volviendo al Menu Principal...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
    }

    private void contratarTrabajador() {
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el primer apellido del trabajador: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Ingrese el segundo apellido del trabajador: ");
        String apellido2 = scanner.nextLine();
        gestionTrabajadores.contratarTrabajador(nombre, apellido1, apellido2);
    }

    private void despedirTrabajador() {
        System.out.print("Ingrese el ID del trabajador a despedir: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        gestionTrabajadores.despedirTrabajador(id);
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
                if (inventario.remove(ingrediente)) {
                    System.out.println("Ingrediente eliminado.");
                } else {
                    System.out.println("El ingrediente no se encuentra en el inventario.");
                }
            }
            default -> System.out.println("Opcion no valida.");
        }
    }
}
