package proyectorestaurante;


import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class PedidoService {
    private List<Mesa> mesas = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public PedidoService(int numeroMesas) {
        for (int i = 1; i <= numeroMesas; i++) {
            mesas.add(new Mesa(i));
        }
    }

    public void gestionarPedidos() {
        System.out.print("Ingrese el numero de mesa: ");
        int numeroMesa = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Mesa mesa = buscarMesa(numeroMesa);
        if (mesa != null && mesa.isDisponible()) {
            mesa.ocupar();
            Pedido pedido = new Pedido(numeroMesa);
            pedidos.add(pedido);

            System.out.println("Ingrese los platillos (escriba 'fin' para terminar):");
            while (true) {
                System.out.print("Nombre del platillo: ");
                String nombrePlatillo = scanner.nextLine();
                if (nombrePlatillo.equalsIgnoreCase("fin")) break;

                System.out.print("Precio del platillo: ");
                double precio = scanner.nextDouble();
                scanner.nextLine(); // Consumir nueva línea

                pedido.agregarPlatillo(new Platillo(nombrePlatillo, "", precio));
            }
        } else {
            System.out.println("Mesa no disponible o inexistente.");
        }
    }

    private Mesa buscarMesa(int numero) {
        return mesas.stream().filter(m -> m.getNumero() == numero).findFirst().orElse(null);
    }
}
