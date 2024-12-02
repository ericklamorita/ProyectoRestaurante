
package Listas;


public class Ordenes {
   private String nombre;
   private String orden;
   private int mesa;
   private double total;
   private boolean estado;

    public Ordenes(String nombre, String orden, int mesa, double total, boolean estado) {
        this.nombre = nombre;
        this.orden = orden;
        this.mesa = mesa;
        this.total = total;
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
   
    
   
   
}




