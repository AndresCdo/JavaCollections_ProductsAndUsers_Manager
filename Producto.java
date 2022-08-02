public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private String categoria;
    private double precio;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(){}
    
    public Producto(String nombre, int cantidad, String categoria, double precio) {
        this.setNombre(nombre);
        this.setCantidad(cantidad);
        this.setCategoria(categoria);
        this.setPrecio(precio);
    }

    //no elimine ni modifique este metodo
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
}