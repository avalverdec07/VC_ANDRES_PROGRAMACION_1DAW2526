package UT02;

public class Ej03_Apartado3_2 {
/*
 * Utiliza la clase String para crear una variable con un texto y muestra:
 * 	o La longitud de la cadena (length()).
 * 	o El texto en mayúsculas (toUpperCase()).
 * 	o Si contiene la palabra "Java" (contains("Java"))
 */
	public static void main(String args[]) {
	String variable = "Hoy es martes y estamos aprendiendo a utilizar la clase String en Java";
	
	String mayusculas = variable.toUpperCase();
	String minusculas = variable.toLowerCase();
	
	System.out.println("La frase en mayúsculas es: "+mayusculas);
	System.out.println("La frase en minusculas es: "+minusculas);
	
	System.out.println(minusculas.contains("java"));
	System.out.println(mayusculas.contains("Java"));
	
	
	
	
	}
	
	
}
