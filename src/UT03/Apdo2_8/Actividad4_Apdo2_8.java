package UT03.Apdo2_8;

import java.util.Scanner;

public class Actividad4_Apdo2_8 {

	public static void main(String[] args) {
	/* Crea un menú que se repita hasta que el usuario elija “Salir”, 
	 * utilizando un do-while.
	 */

		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Introduce: \n Pulsa 1 para Seguir \n 2 para Salir");
			opcion=teclado.nextInt();
		} while(opcion!=2);
		System.out.println("Saliendo del menú... adiós!!");
		teclado.close();
	}

}
