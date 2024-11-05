package proyectorestaurante;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuService menuService = new MenuService();
        PedidoService pedidoService = new PedidoService(5); // 5 mesas disponibles

        int opcion;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Gestion de Menu");
            System.out.println("2. Gestion de Pedidos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuService.gestionarMenu();
                    break;
                case 2:
                    pedidoService.gestionarPedidos();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}


