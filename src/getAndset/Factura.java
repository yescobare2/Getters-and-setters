package getAndset;

public class Factura {
    private String codigo;
    private int cantidad;
    private double precioUnitario;

    public Factura(String codigo, int cantidad, double precio) {
        this.codigo = codigo;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public void setCantidad(int c) {
        if (c <= 0) throw new IllegalArgumentException("Cantidad debe ser mayor a 0.");
        this.cantidad = c;
    }

    public void setPrecio(double p) {
        if (p <= 0) throw new IllegalArgumentException("Precio debe ser mayor a 0.");
        this.precioUnitario = p;
    }

    public void mostrar() {
        double total = cantidad * precioUnitario;
        System.out.println("Factura: " + codigo + " | Total: " + total);
    }
}