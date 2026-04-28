package Marcos;

public class Participante {
	
	private String nombre;
	private int edad;
	private double tiempo;
	
	public Participante(String nombre, int edad, double tiempo) {
		this.nombre = nombre;
		this.edad = edad;
		this.tiempo = tiempo;
	}

	public void mostrarDatos() {
		System.out.println("-----DATOS DEL PARTICIPANTE-----");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: "+this.edad);
		System.out.println("Tiempo: "+this.tiempo);
	}
	
	public double calcularPuntuacion() {
		double puntuacion = 1000 / this.tiempo;
		
		puntuacion = Math.round(puntuacion*100.0)/100.0;
		
		return puntuacion;	
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

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	
}
