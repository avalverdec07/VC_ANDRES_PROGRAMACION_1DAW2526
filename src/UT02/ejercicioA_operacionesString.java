package UT02;

import java.util.Scanner;

public class ejercicioA_operacionesString {

	public static void main(String[] args) {
		// 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		
		String frase = teclado.nextLine();
		
		System.out.println("La longitud de la frase es: "+frase.length());
		
		System.out.println("La primera letra es: "+frase.charAt(0));
		System.out.println("La primera letra es: "+frase.charAt(frase.length()-1));
		
		
		
		

	}

}
