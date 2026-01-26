package UT05.Arrays;
import java.util.Scanner;
public class EscanerPrecios {

	public static void main(String[] args) {
		
		final int TAMAÑO = 4;
		
		
		Scanner teclado = new Scanner(System.in);
		double precios[] = new double[TAMAÑO];
		
		// Pedimos los datos al usuario
		System.out.println("Introduce 4 precios: ");
		System.out.println("---------------------");
		System.out.println("Introduce el precio 1: ");
		precios[0]=teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce el precio 2: ");
		precios[1]=teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce el precio 3: ");
		precios[2]=teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduce el precio 4: ");
		precios[3]=teclado.nextDouble();
		teclado.nextLine();
		
		//Recorremos el array para calcular la suma y el promedio
		double suma=0;
		double promedio=0;
		
		for(int i=0; i<precios.length; i++) {
			suma+=precios[i];
		}
		
		promedio=suma/precios.length;
		
		System.out.println("La suma de todos los precios es: "+suma);
		System.out.println("El promedio de todos los precios: "+promedio);
		
		
		
		
		
	}

}
