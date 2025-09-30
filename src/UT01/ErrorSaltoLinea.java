package UT01;

import java.util.Scanner;

public class ErrorSaltoLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		// Es necesario leer el salto de línea con otro nextLine();
		// Ya que el nextInt() sólo lee el número y no el salto de línea (\n)
		sc.nextLine();
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine(); // <-- Error: se lee una línea vacía
		
		System.out.println("Tu edad es: "+edad);
		System.out.println("Tu nombre es: "+nombre);
		
	}

}
