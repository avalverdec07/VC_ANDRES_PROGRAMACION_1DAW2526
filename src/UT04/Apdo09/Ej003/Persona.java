package UT04.Apdo09.Ej003;

public class Persona {
	private String nombre;
	private int edad;
	
	
	public Persona(String n, int e) {
		this.nombre=n;
		this.edad=e;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void presentarse() {
		System.out.print("Hola, soy "+nombre+" y tengo "+edad+" años.");
	}
}
