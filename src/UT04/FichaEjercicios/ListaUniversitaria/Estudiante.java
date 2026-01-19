package UT04.FichaEjercicios.ListaUniversitaria;

import java.util.Scanner;

public class Estudiante extends Persona{
	private String campoEstudio;
	private double calificaciones;
	
	public void setCampoEstudio() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el campo de estudio: ");
		this.campoEstudio = teclado.nextLine();
		teclado.close();	
	}
	
	public void setCalificaciones() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el promedio de calificaciones: ");
		this.calificaciones = teclado.nextDouble();
		teclado.close();	
	}

	@Override
	public String toString() {
		return "Estudiante [campoEstudio=" + campoEstudio + ", calificaciones=" + calificaciones + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
				+ ", telefono=" + telefono + "]";
	}
	
	

}
