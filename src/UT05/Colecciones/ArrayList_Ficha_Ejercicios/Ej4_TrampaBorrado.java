package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ej4_TrampaBorrado {

	public static void main(String[] args) {

	List<Integer> valores = new ArrayList<>();
	
	
	valores.add(20);
	valores.add(10);
	valores.add(30);
	valores.add(15);
	valores.add(12);
	valores.add(42);
	
	System.out.println("--- VALORES ORIGINALES DEL ARRAYLIST ---");
	for(Integer numero : valores) {
		System.out.println(numero);
	}
	
	for(int i=0; i<valores.size();i++) {
		if (valores.get(i)<20) {
			valores.remove(i);
		}
	}
	
	/* orden que elimina los valores que cumplen una condición sin
	 * necesidad de bucle:
	 * valores.removeIf(n->n<20);
	*/

	
	System.out.println("--- VALORES DESPUÉS DE ELIMINAR <20 ---");
	for(Integer numero : valores) {
		System.out.println(numero);
	}
	
	
	for(int i=valores.size()-1; i>=0 ;i--) {
		if (valores.get(i)<20) {
			valores.remove(i);
		}
	}
	
	System.out.println("--- CON BUCLE HACIA ATRÁS. VALORES DESPUÉS DE ELIMINAR <20 ---");
	for(Integer numero : valores) {
		System.out.println(numero);
	}
	
		
	}

}
