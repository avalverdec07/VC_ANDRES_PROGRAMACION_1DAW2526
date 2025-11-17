package UT03.FichaEjercicios;


/*
 * @author: Andres 
 */
import java.util.Scanner;

public class Ej13_ComprobarFecha {

	public static void main(String[] args) {
		/* 13. Crea un programa llamado ComprobarFecha, que pida una fecha formada por tres valores
			numéricos (día, mes y año), y determine si la fecha corresponde a un valor válido.
			Pista: se debe tener presente el valor de los días en función de los meses y de los años. Es decir:
			▪ Los meses 1, 3, 5, 7, 8, 10 y 12 tienen 31 días.
			▪ Los meses 4, 6, 9 y 11 tienen 30 días.
			▪ El mes 2 tiene 28 días, excepto cuando el año es divisible por 4, que tiene 29 días.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Bienvenido a ComprobarFecha. "
				+ "Introduce una fecha y te diré si es correcta.");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Introduce el año: ");
		int año = teclado.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = teclado.nextInt();
		System.out.println("Introduce el dia: ");
		int dia = teclado.nextInt();
		
		switch(mes) {
		
		case 1,3,5,7,8,10,12:
			if (dia>=1 && dia<=31) {
				System.out.println("La fecha es correcta.");
			} else {
				System.out.println("La fecha es INCORRECTA.");
			}
			break;
		case 4,6,9,11:
			if (dia>=1 && dia<=30) {
				System.out.println("La fecha es correcta.");
			}else {
				System.out.println("La fecha es INCORRECTA.");
			}
			break;
		case 2:
			if (año % 4 ==0) {
				// Si el año es bisiesto.
				if (dia>=1 && dia<=29) {
					System.out.println("La fecha es correcta.");
				}else {
						System.out.println("La fecha es INCORRECTA.");
				}
			} else if (dia>=1 && dia<=28) {
				//Si no es año bisiesto.
					System.out.println("La fecha es correcta.");
			} else {
				System.out.println("La fecha es INCORRECTA.");
			}
			break;
		}
		teclado.close();
	}

}
