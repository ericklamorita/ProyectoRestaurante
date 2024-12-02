package Trabajadores;

public class Trabajador {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Trabajador(int id, String nombre, String apellido1, String apellido2) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID " + id + ", Nombre: " + nombre + " " + apellido1 + " " + apellido2;
    }
}
