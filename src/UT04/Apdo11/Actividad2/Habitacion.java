package UT04.Apdo11.Actividad2;

public class Habitacion {

	private String nombre;
	private double metrosCuadrados;
	
	public Habitacion(String nombre, double metrosCuadrados) {
		this.nombre = nombre;
		this.metrosCuadrados = metrosCuadrados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", metrosCuadrados=" + metrosCuadrados + "]";
	}
	
	
	
	
}
