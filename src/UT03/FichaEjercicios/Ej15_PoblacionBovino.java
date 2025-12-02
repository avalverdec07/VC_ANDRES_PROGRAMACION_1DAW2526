package UT03.FichaEjercicios;
/**
 * Suponga que la población de bovino de la provincia Cáceres es de 354000 
 * y que la población aumenta 1.01 por ciento anualmente. 
 * Suponga que la población de ovino de Badajoz es de 410000 y que la población 
 * se reduce 0,15 por ciento anual. Escribir una aplicación que muestra las 
 * poblaciones de las dos provincias cada año hasta que la población de Cáceres 
 * exceda a la de los Badajoz, y muestre el número de años que se necesitó para superar.
 * Guarde el archivo como PoblacionBovina.java.
 * 
 * @author Andrés Valverde
 * @version 1.0
 */
public class Ej15_PoblacionBovino {

	
	public static void main(String[] args) {
		double caceres = 354000;
		double badajoz = 410000;
		
		double aumento=1.01;
		double reduccion = 0.05;
		
		int años=1;
		
		while(caceres<=badajoz) {
			System.out.println("Año: "+años);
			caceres = caceres+(caceres*aumento/100);
			badajoz = badajoz-(badajoz*reduccion/100);
			System.out.printf("La población de Cáceres es: %.2f \n", caceres);
			System.out.printf("La población de Badajoz es: %.2f \n", badajoz);
			años++;
		}
	}

}
