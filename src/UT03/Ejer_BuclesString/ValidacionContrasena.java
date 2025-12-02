package UT03.Ejer_BuclesString;

import java.util.Scanner;

/**
 * @author Andrés
 */

public class ValidacionContrasena {

	public static void main(String[] args) {
		// Pedimos una cadena al usuario
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una contraseña para validar: ");
		String cadena = teclado.nextLine();
		
		//Comprobamos que la cadena cumple el requisito de longitud
		if (cadena.length()<8) {
			System.out.println("Cadena no válida: debe tener 8 o más carácteres.");
		} else {
			// Comprobamos que tiene letras, números y carácteres especiales
			boolean minus=false;
			boolean mayus=false;
			boolean numero=false;
			boolean carac=false;
			int i=0;
			do {
				System.out.println(cadena.charAt(i));
				if (!minus && Character.isLowerCase(cadena.charAt(i))) {
					System.out.println("Entra en minúscula");
					minus=true;
				} else {
					if (!mayus && Character.isUpperCase(cadena.charAt(i))) {
						System.out.println("Entra en mayúscula");
						mayus=true;
					} else 
						if (!numero && Character.isDigit(cadena.charAt(i))) {
							System.out.println("Entra en número");
							numero=true;
						} else {
							if (!carac && (cadena.charAt(i)=='_'||cadena.charAt(i)=='-'||cadena.charAt(i)=='$')) {
								System.out.println("Entra en caracter especial");
								carac=true;
						}
						} 
				}
				i++;
			} while (i<cadena.length()&&(!minus||!mayus||!numero||!carac));
			if (minus&&mayus&&numero&&carac) {
				System.out.println("La cadena es válida.");
			} else {
					System.out.println("La cadena debe incluir una mayúscula, "
							+ "una minúscula, un número y un carácter especial (-,_,$");
				}
			}
		}
	}

