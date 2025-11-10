package UT03;

public class Actividad1_Apdo3_7 {

	public static void main(String[] args) {
		/* Ejercicio 1
		*  Crea un programa que muestre los números del 1 al 20, 
		*  pero se detenga al llegar al 13 usando break.
		*/
		for (int i=0; i<=20; i++) {
			if (i==13) {
				break;
			}
			System.out.println(i);
		}
	}

}
