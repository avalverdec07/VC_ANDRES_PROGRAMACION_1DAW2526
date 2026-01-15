package UT04.Apdo11.Ejercicio3;

public class Cliente {
	private String nombre;
	private String dni;
	private String direccion;
	private int telefono;
	
	public Cliente(String n, String dni, String direc, int t) {
		this.nombre=n;
		this.dni=dni;
		this.direccion=direc;
		this.telefono=t;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
}
