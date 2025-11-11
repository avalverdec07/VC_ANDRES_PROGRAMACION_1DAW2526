package UT03.Apdo1_7;

import java.util.Scanner;

public class Actividad3_Apdo1_7 {

	public static void main(String[] args) {
/* Crea un programa que pida la nota de un alumno (0 a 10) y muestre:
	• “Suspenso” si < 5
	• “Aprobado” si 5–6
	• “Notable” si 7–8
	• “Sobresaliente” si 9–10
*/
	
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce la nota del alumno: ");
	int nota = teclado.nextInt();
	
	if (nota>=9) {
		System.out.println("La calificación final es de SOBRESALIENTE.");
	} else if (nota>=7) {
		System.out.println("La calificación final es de NOTABLE.");
	} else if (nota>=5) {
		System.out.println("La calificación final es de APROBADO.");
	} else {
		System.out.println("La calificación final es de SUSPENSO.");
	}
	
	
	teclado.close();
	}
}
