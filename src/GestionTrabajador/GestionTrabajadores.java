package GestionTrabajador;

import Trabajadores.Trabajador;
import java.util.ArrayList;
import java.util.List;

public class GestionTrabajadores {
    
    private List<Trabajador> trabajadores;
    private int siguienteId; 

    //aumenta con cada trabajador nuevo
    public GestionTrabajadores() {
        trabajadores = new ArrayList<>();
        siguienteId = 1; 
    }

    // Método para contratar 
    public void contratarTrabajador(String nombre, String apellido1, String apellido2) {
        Trabajador nuevoTrabajador = new Trabajador(siguienteId, nombre, apellido1, apellido2);
        trabajadores.add(nuevoTrabajador);
        siguienteId++;
        System.out.println("Trabajador contratado: " + nuevoTrabajador);
    }

    // Método para despedir 
    public void despedirTrabajador(int id) {
        Trabajador trabajadorEncontrado = null;
        for (Trabajador t : trabajadores) {
            if (t.getId() == id) {
                trabajadorEncontrado = t;
                break;
            }
        }

        if (trabajadorEncontrado != null) {
            trabajadores.remove(trabajadorEncontrado);
            System.out.println("Trabajador despedido: " + trabajadorEncontrado);
        } else {
            System.out.println("No se encontro al trabajador con ID: " + id);
        }
    }

    //lista de todos los trabajadores
    public void mostrarTrabajadores() {
        if (trabajadores.isEmpty()) {
            System.out.println("No hay trabajadores en el sistema.");
        } else {
            System.out.println("Lista de trabajadores:");
            for (Trabajador t : trabajadores) {
                System.out.println(t);
            }
        }
    }
}
