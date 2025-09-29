package UT01;

import java.util.Scanner; 

public class Ej01_Nombre_Edad { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Introduce tu nombre: "); 
		String nombre = sc.nextLine(); 
		
		System.out.print("Introduce tu edad: "); 
		int edad = sc.nextInt(); 
		
		System.out.println("Hola "+nombre+", tienes "+edad+" años."); 
		
	} 
	
}
