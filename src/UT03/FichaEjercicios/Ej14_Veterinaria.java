package UT03.FichaEjercicios;
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

import java.util.Scanner;

public class Ej14_Veterinaria {
	
	final static int DESCUENTO = 8;
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double analisis1 = 25.00;
		double analisis2 = 36.00;
		double analisis3 = 50.00;
		
		System.out.println("********** BIENVENIDO A LA CLÍNICA VETERINARIA **********");
		System.out.println();
		System.out.println("¿Estás afiliado a nuestra clínica? (S o N)");
		String cadena = teclado.nextLine();
		if (cadena.charAt(0) == 'S' || cadena.charAt(0) == 's') {
			analisis1=analisis1-(analisis1*DESCUENTO/100);
			analisis2=analisis2-(analisis2*DESCUENTO/100);
			analisis3=analisis2-(analisis3*DESCUENTO/100);
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
					System.out.println("El precio del análisis tipo 1 es de: "+analisis1);
				break;
			case 2:
					System.out.println("El precio del análisis tipo 2 es de: "+analisis2);
				break;
			case 3:
					System.out.println("El precio del análisis tipo 3 es de: "+analisis3);
				break;
			case 4: 
				System.out.println("¡Hasta la próxima!");
				break;
			default:
				System.out.println("No has introducido una opción válida.");
				break;
			}
		} while(opcion!=4);
		teclado.close();
	}
}
