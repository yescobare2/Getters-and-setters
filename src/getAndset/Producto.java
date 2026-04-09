package getAndset;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	//Constructor
	public Producto(String codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		setPrecio(precio);
		setStock(stock);
	}
	
	//Getters y Setters
 
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio <= 0) {
			throw new IllegalArgumentException("El precio debe ser mayor de 0");
		}
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0) {
			throw new IllegalArgumentException("El stock no puede ser negativo");
		}
		this.stock = stock;
	}
	
	//Metodo para vender
	public void vender(int cantidad ) {
		if (cantidad > this.stock) {
			throw new RuntimeException("No hay suficiente stock para vender" + cantidad + "unidades");
		}
		this.stock -= cantidad;
	}
	
 //Metodo mostrar
	public void mostrar() {
		System.out.println(" Codigo: " + codigo + "| Producto " + nombre + "| Precio$ " + precio + "| Stock " + stock);
	}
	}

