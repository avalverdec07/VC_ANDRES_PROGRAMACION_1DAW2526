package UT03.FichaEjercicios;

import java.util.Scanner;

public class Ej08_capicua {

	public static void main(String[] args) {
		// Comprobar si un número es capicúa.
		
		/* 4567
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero=teclado.nextInt();
		int original=numero;
		int inverso=0;
		
		/* Ejemplo:
		 * original=5669
		 * 
		 * Primera iteración del bucle:
		 * numero=5669
		 * inverso=9
		 * numero=566
		 * 
		 * Segunda iteración del bucle:
		 * inverso=96
		 * numero=56
		 * 
		 * Tercera iteración del bucle y última:
		 * inverso=966
		 * numero=5
		 * 
		 */
		while(numero>10) {
			inverso=(inverso*10)+numero%10;
			numero=numero/10;
		}
		/* Finalmente, multiplicamos por 10 y le sumamos el último dígito que no queda
		*  inverso=9665
		*/
		inverso=(inverso*10)+numero%10;
		
		if (inverso == original) {
			System.out.println("El número es capicúa.");
		} else {
			System.out.printf("El número al revés es %d y por lo tanto no es capicúa.",inverso);
			
		}
		
		teclado.close();
		

	}

}
