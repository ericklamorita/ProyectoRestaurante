package proyectorestaurante;

public class Trabajador {
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Trabajador(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2;
    }
}