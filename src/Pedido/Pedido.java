package Pedido;

import Platillo.Platillo;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroMesa;
    private List<Platillo> platillos = new ArrayList<>();
    private double total;

    public Pedido(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    // Getter del número de la mesa
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void agregarPlatillo(Platillo platillo) {
        platillos.add(platillo);
        total += platillo.getPrecio();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido de la Mesa " + numeroMesa + ":\n");
        for (Platillo p : platillos) {
            sb.append(p).append("\n");
        }
        sb.append("Total: $").append(total);
        return sb.toString();
    }
}
