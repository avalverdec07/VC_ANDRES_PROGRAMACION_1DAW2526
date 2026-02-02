package UT05.Arrays.Ficha_Inicial_Ejercicios;

public class Ej2_LluviaVera {

	public static void main(String[] args) {

		// Declaración de un array en una línea con valores.
		double dias[]= {12.3,0,23.4,45.5,67.6,0,12};
		
		System.out.println("El miércoles llovieron "+dias[2]+" litros por m2.");
		
		//Modificamos en el array el valor de la posción 4 (viernes).
		dias[4]=45.0;
		
		System.out.println("El viernes llovieron "+dias[4]+" litros por m2.");
		
	}

}
