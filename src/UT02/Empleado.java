package UT02;

public class Empleado {

	/*
	 * Crea la clase Empleado con atributos nombre y salario.
		o Añade un método aumentarSalario(double porcentaje).
		o Añade un método mostrarInfo() que imprima nombre y salario.
	 */
	
	//Atributos privados de la clase
	private String nombre;
	private double salario;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double aumento) {
		
		this.salario+=aumento;	
		
	}
	
	public void mostrarInfo() {
		System.out.println("El empleado se llama: "+this.nombre);
		System.out.println("Su salario es de: "+this.salario+"€");
		System.out.println("--------------------------------");
		
	}
	
}
