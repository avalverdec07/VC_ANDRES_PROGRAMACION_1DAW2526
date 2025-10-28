package UT03;

import java.util.Scanner;

public class Actividad2_Apdo1_7 {

	public static void main(String[] args) {
		/* Pide al usuario un número del 1 al 7 y muestra el nombre del día de 
		*  la semana con switch
		*/		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int dia = teclado.nextInt();
		
		switch (dia) {
		 case 1:
			 System.out.println("Lunes");
			 break;
		 case 2:
			 System.out.println("Martes");
			 break;
		 case 3:
			 System.out.println("Miércoles");
			 break;
		 case 4:
			 System.out.println("Jueves");
			 break;
		 case 5:
			 System.out.println("Viernes");
			 break;
		 case 6:
			 System.out.println("Sábado");
			 break;
		 case 7:
			 System.out.println("Domingo");
			 break;
		 default:
			 System.out.println("Día no válido");
		}
		teclado.close();
	}
}
