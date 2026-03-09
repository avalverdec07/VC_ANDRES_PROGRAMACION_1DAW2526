package UT05.Expresiones_Regulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ej1_NumeroBinario {

	public static boolean esBinarioValido(String numero) {
		
		return (numero.matches("^\\d[0-1]+$"));
	}
	
	public static void main(String[] args) {

		//String regex = "^\\d[0-1]+$";

		//Pattern pattern = Pattern.compile(regex);
		
	    Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número binario: ");
		String numero = teclado.nextLine();
		
	    //Matcher matcher = pattern.matcher(numero);

		
		if (esBinarioValido(numero)) {
			System.out.println("El número introducido es válido.");
		} else {
			System.out.println("El número introducido NO ES un número binario válido.");
		}
	}
}
