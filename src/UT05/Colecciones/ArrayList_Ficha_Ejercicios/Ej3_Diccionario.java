package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Crea un pequeño traductor.
 * Carga inicialmente en un HashMap 5 palabras 
 * (ej: "Perro" -> "Dog", "Gato" -> "Cat").
 * Pide una palabra en español al usuario.
 * 		Si existe, muestra su traducción. 
 * 		Si no existe, pregúntale al usuario cómo se dice en inglés, 
 * 					añádela al mapa y dale las gracias por enseñarte.
 */
public class Ej3_Diccionario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Map<String, String> diccionario = new HashMap<>();
		
		diccionario.put("PERRO", "Dog");
		diccionario.put("GATO", "Cat");
		diccionario.put("CASA", "House");
		diccionario.put("COCHE", "Car");
		diccionario.put("PEPINO", "Cucumber");
		
		System.out.println("Bienvenido al Diccionario Spanish/English!!!");
		System.out.println("Pregúntame qué palabra quieres traducir.");
		System.out.println("(Fin para terminar.)");
		String palabra="";
		String traduccion="";
		do {
			System.out.println("Palabra en español: ");
			palabra=entrada.nextLine().toUpperCase();
			if (diccionario.containsKey(palabra)) {
				System.out.println("En inglés se dice: "+diccionario.get(palabra));
			} else {
				System.out.println("No sé traducir esa palabra. Dímelo tú:");
				traduccion=entrada.nextLine();
				diccionario.put(palabra, traduccion);
				System.out.println("Gracias por enseñarme. ");
			}
		}while(!palabra.equalsIgnoreCase("fin"));
		
	}

}
