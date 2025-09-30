package UT01;

import java.util.Scanner;

public class EjemploApartado9 {

	public static void main(String[] args) {
		// Declaración de variables
		char letra, letra2, palabra;
		int x,b, codigo, num ;
		double y, a;
		
		//Conversión implícita
		 x = 7;
		 y = x; // int → double
		 System.out.println("Implícita: " + y);
		 // Conversión explícita
		 a = 7.85;
		 b = (int) a; // double → int
		 System.out.println("Explícita: " + b);
		 
		 // char ↔ int
		 letra = 'C';
		 codigo = letra;
		 System.out.println("Código de 'C': " + codigo);
		 num = 68;
		 letra2 = (char) num;
		 System.out.println("Letra del 68: " + letra2);
		 
		 // ACTIVIDAD 3: Pedir una letra al usuario y mostrar el código de esa letra
		 
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Introduce una letra: ");
		 letra = teclado.nextLine().charAt(0);
		 codigo = letra;
		 System.out.println("El código de la letra introducida es: " + codigo);

		 //ACTIVIDAD 4
		 int n = 1000;
		 byte otro = (byte)n;
		 System.out.println("El valor de convertir 1000 de tipo int a byte es: "+otro);
		 
		 // Pérdida de datos
		 int grande = 300;
		 byte pequeño = (byte) grande;
		 System.out.println("Conversión con pérdida: " + pequeño);

	}

}
