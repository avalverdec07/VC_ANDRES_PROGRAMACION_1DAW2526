package UT02;

import java.util.Scanner;

/*
 * Ejercicio 1 del Apartado 1
 * Crea una clase Perro con los atributos nombre y raza, y un método ladrar()
 * que muestre por pantalla "Guau, guau".
 *  
 *  Crea dos objetos Perro en el main y llama al método.
 */

public class Perro {
	// Atributos
	private String nombre;
	private String raza;
	
	//Métodos
	public void setNombre(String n) {
		   nombre = n;
	}
	
	public void setRaza(String r) {
		raza = r;
	}
	

	public void ladrar() {
		System.out.println(nombre + " está ladrando: ");
		System.out.println("Guau Guau");
		System.out.println();
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro mascota = new Perro();
		Perro caza = new Perro();
		
		Scanner sc = new Scanner(System.in); 	    
		
		
		mascota.setNombre("Recesvinto");
		mascota.setRaza("Bichón maltés");
		
		
		caza.setNombre("Rambo");
		caza.setRaza("Boxer");
		
		mascota.ladrar();
		caza.ladrar();
	}
}
