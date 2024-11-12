package ServicioCocina;

import GestionTrabajador.GestionTrabajadores;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicio_de_cocina {
    private GestionTrabajadores gestionTrabajadores;
    private Map<String, Integer> inventario;
    private Scanner scanner;

    public Servicio_de_cocina() {
        gestionTrabajadores = new GestionTrabajadores();
        inventario = new HashMap<>();
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
            System.out.println("5. Agregar/Eliminar o Modificar Ingredientes");
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
            for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
                System.out.println(entry.getKey() + " - Cantidad: " + entry.getValue());
            }
        }
    }

    private void modificarInventario() {
        System.out.println("\nModificar Inventario");
        System.out.println("1. Agregar o Aumentar Cantidad de Ingrediente");
        System.out.println("2. Reducir Cantidad de Ingrediente");
        System.out.println("3. Eliminar Ingrediente");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el nombre del ingrediente: ");
                String ingrediente = scanner.nextLine();
                System.out.print("Ingrese la cantidad a agregar: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                inventario.put(ingrediente, inventario.getOrDefault(ingrediente, 0) + cantidad);
                System.out.println("Ingrediente agregado o cantidad aumentada.");
            }
            case 2 -> {
                System.out.print("Ingrese el nombre del ingrediente: ");
                String ingrediente = scanner.nextLine();
                if (inventario.containsKey(ingrediente)) {
                    System.out.print("Ingrese la cantidad a reducir: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    int cantidadActual = inventario.get(ingrediente);
                    if (cantidad >= cantidadActual) {
                        inventario.remove(ingrediente);
                        System.out.println("Ingrediente eliminado porque la cantidad llego a cero o menos.");
                    } else {
                        inventario.put(ingrediente, cantidadActual - cantidad);
                        System.out.println("Cantidad reducida.");
                    }
                } else {
                    System.out.println("El ingrediente no se encuentra en el inventario.");
                }
            }
            case 3 -> {
                System.out.print("Ingrese el nombre del ingrediente a eliminar: ");
                String ingrediente = scanner.nextLine();
                if (inventario.remove(ingrediente) != null) {
                    System.out.println("Ingrediente eliminado del inventario.");
                } else {
                    System.out.println("El ingrediente no se encuentra en el inventario.");
                }
            }
            default -> System.out.println("Opcion no valida.");
        }
    }
}
