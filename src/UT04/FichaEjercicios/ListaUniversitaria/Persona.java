package UT04.FichaEjercicios.ListaUniversitaria;

import java.util.Scanner;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected int codigoPostal;
	protected int telefono;
	
	public void setNombre() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre: ");
		this.nombre = teclado.nextLine();
		teclado.close();
	}
	
	public void setApellido() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el apellido: ");
		this.apellido = teclado.nextLine();
		teclado.close();	
	}
	
	public void setDireccion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la direccion: ");
		this.direccion = teclado.nextLine();
		teclado.close();	
	}
	
	public void setCodigoPostal() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el código postal: ");
		this.codigoPostal = teclado.nextInt();
		teclado.close();	
	}
	
	public void setTelefono() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el teléfono: ");
		this.telefono = teclado.nextInt();
		teclado.close();	
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", codigoPostal="
				+ codigoPostal + ", telefono=" + telefono + "]";
	}
	
	

}
