package proyectorestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoService {
    private List<Mesa> mesas = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private MenuService menuService;

    public PedidoService(int numeroMesas, MenuService menuService) {
        for (int i = 1; i <= numeroMesas; i++) {
            mesas.add(new Mesa(i));
        }
        this.menuService = menuService;
    }

    public void gestionarPedidos() {
        int opcion;
        do {
            System.out.println("\n******* Gestion de Mesas *******");
            System.out.println("1. Escoger mesa");
            System.out.println("2. Seleccionar mesa");
            System.out.println("3. Eliminar mesa");
            System.out.println("4. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1: 
                    escogerMesa();
                    break;
                case 2:
                    seleccionarMesa();
                    break;
                case 3:
                    eliminarMesa();
                    break;
                case 4:
                    System.out.println("Volviendo al Menu Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }

    // Escoger las mesas, tomar pedido y mostrar tambien los recivos 
    private void escogerMesa() {
        System.out.print("Ingrese el numero de la mesa: ");
        int numeroMesa = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null && mesa.isDisponible()) {
            mesa.ocupar();
            Pedido pedido = new Pedido(numeroMesa);
            pedidos.add(pedido);

            System.out.print("Nombre del cliente que hizo la reserva: ");
            String nombreCliente = scanner.nextLine();
            System.out.println("Ingrese los platillos (escriba 'fin' para terminar):");
            while (true) {
                System.out.print("Nombre del platillo: ");
                String nombrePlatillo = scanner.nextLine();
                if (nombrePlatillo.equalsIgnoreCase("fin")) break;

                System.out.print("Precio del platillo: ");
                double precio = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer

                Platillo platillo = new Platillo(nombrePlatillo, "", precio);
                pedido.agregarPlatillo(platillo);
            }

            System.out.println("Pedido registrado exitosamente para la mesa " + numeroMesa);
        } else {
            System.out.println("Mesa no disponible o inexistente.");
        }
    }

    // Seleccionar la mesa y mostrar su recibo
    private void seleccionarMesa() {
        System.out.print("Ingrese el numero de la mesa: ");
        int numeroMesa = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null && !mesa.isDisponible()) {
            Pedido pedido = buscarPedido(numeroMesa);
            if (pedido != null) {
                System.out.println(pedido);
            } else {
                System.out.println("No hay pedido registrado para esta mesa.");
            }
        } else {
            System.out.println("Mesa no disponible o inexistente.");
        }
    }

    // Eliminar mesa
    private void eliminarMesa() {
        System.out.print("Ingrese el numero de la mesa a liberar: ");
        int numeroMesa = scanner.nextInt();
        scanner.nextLine(); 

        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null && !mesa.isDisponible()) {
            mesa.liberar();
            System.out.println("Mesa " + numeroMesa + " liberada exitosamente.");
        } else {
            System.out.println("Mesa no ocupada o inexistente.");
        }
    }

    // Buscar las mesas por número
    private Mesa buscarMesa(int numero) {
        return mesas.stream().filter(m -> m.getNumero() == numero).findFirst().orElse(null);
    }

    // Buscar los pedido por número de mesa
    private Pedido buscarPedido(int numeroMesa) {
        return pedidos.stream().filter(p -> p.getNumeroMesa() == numeroMesa).findFirst().orElse(null);
    }
}
