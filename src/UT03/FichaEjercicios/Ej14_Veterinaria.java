package UT03.FichaEjercicios;

import java.util.Scanner;

public class Ej14_Veterinaria {

	public static void main(String[] args) {
		/* 14. En una veterinaria de nuestra localidad ofrece distintos tipos de 
		 * análisis a perros. Los precios de los análisis son como siguen: 
		 * 		Tipo de análisis 1= 25.00 €; 
		 * 		Tipo de análisis 2= 36.00 €; 
		 * 		Tipo de análisis 3= 50.00 €. 
		 * Realizar un programa que muestre el precio al indicar el tipo de análisis.
		 * Por otra parte, existen clientes afiliados y no afiliados. 
		 * En caso de que el animal pertenezca a un cliente afiliado se le descuenta 
		 * un 8% al precio del análisis. 
		 * Introduce en una segunda versión del programa este cálculo.
*/
		Scanner teclado = new Scanner(System.in);
		boolean afiliado=false;
		
		System.out.println("********** BIENVENIDO A LA CLÍNICA VETERINARIA **********");
		System.out.println();
		System.out.println("¿Estás afiliado a nuestra clínica? (S o N)");
		String cadena = teclado.nextLine();
		if (cadena.charAt(0) == 'S' || cadena.charAt(0) == 's') {
			afiliado=true;
		}

		int opcion=0;
		do {
			System.out.println();		
			System.out.println("Selecciona un tipo de análisis:");
			System.out.println("1. Tipo de análisis 1.");
			System.out.println("2. Tipo de análisis 2.");
			System.out.println("3. Tipo de análisis 3.");
			System.out.println("4. Salir.");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1: 
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: 
				
				break;
			default:
				System.out.println("No has introducido una opción válida.");
				break;
			}
			
			}
		while(opcion!=4);
		
		
	}

}
