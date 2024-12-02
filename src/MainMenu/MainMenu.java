package MainMenu;

import MenuService.MenuService;
import PedidoService.PedidoService;
import ServicioCocina.Servicio_de_cocina;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuService menuService = new MenuService();
        Servicio_de_cocina cocinaService = new Servicio_de_cocina();
        PedidoService pedidoService = new PedidoService(15, menuService); 

        int opcion;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Gestion de Mesas");
            System.out.println("2. Gestion de Cocina");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pedidoService.gestionarPedidos();
                    break;
                case 2:
                    cocinaService.gestionarCocina();
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

