package UT04.Apdo11.Ejercicio3;

public class Producto {
	private String nombre;
	private double precio;
	private String marca;
	private String descripcion;
	
	public Producto(String nombre, double precio, String marca, String descripcion) {
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.descripcion = descripcion;
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
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
	
}
