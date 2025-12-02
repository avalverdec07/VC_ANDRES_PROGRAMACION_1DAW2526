package UT03.FichaEjercicios;

import java.util.Scanner;

public class Ej16_Jubilacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		 
		double ahorro_anual=0;
		double ahorro_total=0;
		
		
		System.out.println("¿Cuánto dinero va a ahorrar cada año? ");
		ahorro_anual=teclado.nextDouble();
		
		System.out.println("¿Cuántos años te quedan para jubilarte? ");
		int años = teclado.nextInt();
		
		for (int i=0; i<años; i++) {
			ahorro_total=(ahorro_total*4/100)+ahorro_total+ahorro_anual;
			/* ahorro_total = 	el 4% del ahorro_total que ya tengo  
			 * 					+ ahorro_total que ya tengo 
			 * 					+ lo que ahorro este año
			 * 
			Ejemplo: Ahorro 100€ cada año.
			100
			4+100+100=204
			12,16+204+100=312.16
			*/
		}
		
		System.out.printf("Cuando te jubiles habrás ahorrado: %.2f euros.",ahorro_total);
		teclado.close();
	}

}
