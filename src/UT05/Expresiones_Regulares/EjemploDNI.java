package UT05.Expresiones_Regulares;

import java.util.Scanner;

public class EjemploDNI {

	public static boolean esDniValido(String dni) {
	
		// ^ y $ aseguran que no haya nada más antes ni después
	    return dni.matches("^\\d{8}[A-Za-z]$"); 
	}
	
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hola. Introduce tu DNI: ");
		Scanner teclado = new Scanner(System.in);
		
		String dni = teclado.nextLine();
		
		if (esDniValido(dni)) {
			System.out.println("Tu dni es correcto.");
		} else {
			System.out.println("Tu dni no es válido.");
		}
		
	} 

}
