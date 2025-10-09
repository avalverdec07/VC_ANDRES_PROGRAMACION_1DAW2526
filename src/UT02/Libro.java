package UT02;

public class Libro {
/*
 * Desarrolla una clase Libro con atributos titulo y autor, y un método
 * mostrarInfo() que imprima los datos. Haz un programa que cree dos libros y
 * muestre su información.
 */
	String titulo;
	String autor;

	public void mostrarInfo() {
		System.out.println("Información del libro: ");
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("--- Fin de la información del libro ---");
	}
	
	
	
	public static void main(String args[]) {
		
		Libro libro1 = new Libro();
		libro1.titulo = "El Marciano";
		libro1.autor = "Andy Weir";
		
		libro1.mostrarInfo();
		
		Libro libro2 = new Libro();
		libro2.titulo= "Un Animal Salvaje";
		libro2.autor= "Joel Dicker";
		libro2.mostrarInfo();
		
		
		
		
	}
	
}
