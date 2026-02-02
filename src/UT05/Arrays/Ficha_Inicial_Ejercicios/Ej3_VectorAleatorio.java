package UT05.Arrays.Ficha_Inicial_Ejercicios;
/*
 * @author Andrés Valverde
 */

public class Ej3_VectorAleatorio {

	public static void main(String args[]) {
		
		// Declaramos array de 10 posiciones de números enteros.
		int numero[]=new int[10];
		
		// Fórmula: int ale = (int)(Math.random() * (max - min + 1)) + min;

		//Rellenamos el array con números aleatorios.
		for (int i=0; i<numero.length; i++) {
			numero[i]=(int)(Math.random()*100)+1;
		}
		
		//Recorremos el array para imprimir su contenido separado por guiones
		for(int i=0; i<numero.length;i++) {
			System.out.print(numero[i]);
			if (i!=numero.length-1) {
				System.out.print("-");
			}
			
		}
		
		
	}
	
}
