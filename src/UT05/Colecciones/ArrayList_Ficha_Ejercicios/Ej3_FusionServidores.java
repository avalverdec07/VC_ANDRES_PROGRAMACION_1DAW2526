package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ej3_FusionServidores {

	public static void main(String[] args) {
		
		List<String> servidorA = new ArrayList<>();
		List<String> servidorB = new ArrayList<>();
		List<String> servidorTotal = new ArrayList<>();
		// Añadimos los datos a las listas
		servidorA.add("Juan");
		servidorA.add("Ana");
		servidorA.add("Pedro");
		servidorA.add("Luis");
		
		servidorB.add("Ana");
		servidorB.add("María");
		servidorB.add("Luis");
		servidorB.add("Sofía");
		//Añadimos los datos de las dos listas a servidorTotal
		servidorTotal.addAll(servidorA);
		servidorTotal.addAll(servidorB);
		/* Imprimimos con un bucle for-each servidorTotal y vemos
		 *  que hay nombres duplicados
		 */
		for(String elemento : servidorTotal) {
			System.out.println("Nombre: "+elemento);
		}
		/* Utilizamos un ArrayList auxiliar y un bucle for-each para recorrer
		 * el servidorTotal y añadir en la lista auxiliar los elementos sólo
		 * si no lo hemos añadido ya y así eliminamos los duplicados.
		 */
		List<String> auxiliar = new ArrayList<>();
		for(String nombre : servidorTotal) {
			//Si no hemos añadido ya el nombre, lo añadimos
			if (!auxiliar.contains(nombre)) {
				auxiliar.add(nombre);
			} 
		}
		System.out.println("--- CÓMO QUEDARÍA LA LISTA AL FINAL ---");
		
		/*Restauramos el servidorTotal con el resultado que tenemos en el
		 * ArrayList auxiliar.
		*/
		servidorTotal=auxiliar;
		
		for(String elemento : servidorTotal) {
			System.out.println("Nombre: "+elemento);
		}
	}
}
