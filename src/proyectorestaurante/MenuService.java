package proyectorestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {
    private List<Platillo> menu = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void gestionarMenu() {
        int opcion;
        do {
            System.out.println("\n*******Gestion de Menu******");
            System.out.println("1. Anadir Platillo");
            System.out.println("2. Mostrar Menu");
            System.out.println("3. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> añadirPlatillo();
                case 2 -> mostrarMenu();
                case 3 -> System.out.println("Volviendo al Menu Principal...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);
    }

    private void añadirPlatillo() {
        System.out.print("Nombre del Platillo: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripcion del Platillo: ");
        String descripcion = scanner.nextLine();
        System.out.print("Precio del Platillo: ");
        double precio = scanner.nextDouble();

        Platillo nuevoPlatillo = new Platillo(nombre, descripcion, precio);
        menu.add(nuevoPlatillo);
        System.out.println("Platillo anadido exitosamente.");
    }

    private void mostrarMenu() {
        System.out.println("\nMenu:");
        if (menu.isEmpty()) {
            System.out.println("El menu esta vacio.");
        } else {
            for (Platillo platillo : menu) {
                System.out.println(platillo);
                System.out.println("--------------------");
            }
        }
    }
}
