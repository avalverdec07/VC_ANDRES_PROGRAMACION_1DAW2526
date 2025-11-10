package UT03;

import java.util.Scanner;

public class Actividad3_Apdo2_9 {

	/* Simulación de contraseña.
	 * Pide al usuario una contraseña hasta que acierte con la correcta 
	 * (máximo 3intentos).
	 */
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		String contraseña = "abracadabra";
		int intentos=0;
		boolean acierto=false;
		
		while ((!acierto) && (intentos<4)){
			System.out.println("Introduce la contraseña: ");
			String palabra = teclado.nextLine();
			if (palabra.equalsIgnoreCase(contraseña)) {
				acierto=true;
				System.out.println("¡Enhorabuena! ¡Has acertado!");
			} else {
				System.out.println("Has fallado! Inténtalo otra vez: ");
				intentos++;
			}
		}
		System.out.println("F I N. ");
		teclado.close();
	}
}
