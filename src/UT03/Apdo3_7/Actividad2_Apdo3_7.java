package UT03.Apdo3_7;

public class Actividad2_Apdo3_7 {

	public static void main(String[] args) {
		/* Ejercicio 2
		 * Imprime los números del 1 al 10, saltando los múltiplos de 3 con continue.
		 */
		
		for (int i=0; i<=10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
