package proyectorestaurante;

public class Platillo {
    
    private String nombre;
    private String descripcion;
    private double precio;

    public Platillo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Platillo: " + nombre + "\nDescripcion: " + descripcion + "\nPrecio: $" + precio;
    }
}
