package UT05.Arrays.Ficha_Inicial_Ejercicios;
/**
 * @author Andrés Valverde
 * 
 * Escribe un algoritmo que recorra el array y descubra cuál es el precio 
 * más caro y cuál el más barato.
 * Imprime el resultado al final.
 * Pista: Necesitarás dos variables auxiliares (max y min) inicializadas 
 * con el primer valor del array.
 */
public class Ej5_CazadoresMinMax {

	public static void main(String[] args) {

		double[] precios = {450.0, 120.50, 78.0, 1200.0, 25.95, 300.0};

		double min, max;
		min=precios[0];
		max=precios[0];
		
		for(int i=1; i<precios.length;i++) {
			if (precios[i]<min) {
				min=precios[i];
			}
			if (precios[i]>max) {
				max=precios[i];
			}
		}
		System.out.println("El valor máximo del array es: "+max);
		System.out.println("El valor mínimo del array es: "+min);
		
		
	}

}
