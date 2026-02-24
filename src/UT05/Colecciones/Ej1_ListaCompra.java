package UT05.Colecciones;
/*
 * Crea un programa que permita al usuario añadir productos 
 * a una lista de la compra.
 * Si el usuario escribe "FIN", el programa termina.
 * Al final, imprime la lista completa, el número total de artículos 
 * y permite eliminar el último artículo introducido si el usuario se 
 * arrepiente.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1_ListaCompra {

	public static void main(String[] args) {
		
		List<String> listaCompra = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		String texto="";
		System.out.println("Bienvenido al programa de la lista de la compra."
				+ "\nIntroduce artículos para añadir a la lista de la compra. ");
		System.out.println("(Introduce FIN para terminar.");
		System.out.println("   ---   ---   ---   ");
		do {
			texto=entrada.nextLine();
			if  (!texto.equalsIgnoreCase("FIN"))
				listaCompra.add(texto);
		} while(!texto.equalsIgnoreCase("FIN"));
		
		System.out.println();
		System.out.printf("Tu lista de la compra tiene %d artículos.\n",listaCompra.size());
		System.out.println("La lista de la compra que has introducido es:");
		for(String articulo : listaCompra) {
			System.out.println(articulo);
		}
		
		System.out.println("¿Quieres eliminar el último artículo?");
		texto=entrada.nextLine();
		if (texto.equalsIgnoreCase("si")) {
			listaCompra.remove(listaCompra.size()-1);
			System.out.println("Se ha eliminado el último artículo. Las lista queda así:");
			for(String articulo : listaCompra) {
				System.out.println(articulo);
			}
		}
		
		
	}

}
