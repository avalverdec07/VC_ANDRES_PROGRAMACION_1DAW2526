package Recuperacion;

import java.util.ArrayList;
import java.util.Scanner;


public class MeteoExtremadura {

	public static ArrayList<RegistroMeteo> mediciones = new ArrayList<>();
	public static Scanner teclado = new Scanner(System.in);

	
	public void aniadirTemperatura() {
		
		double temperaturas[] = new double[3];

		System.out.println("----- NUEVO REGISTRO DE TEMPERATURA -----");
		System.out.println("Introduce el municipio: ");
		String municipio = teclado.nextLine();
		
		System.out.println("Introduce la temperatura del viernes: ");
		temperaturas[0] = teclado.nextDouble();
		
		System.out.println("Introduce la temperatura del sábado: ");
		temperaturas[1] = teclado.nextDouble();
		
		System.out.println("Introduce la temperatura del domingo: ");
		temperaturas[2] = teclado.nextDouble();
		
		
		
		
		RegistroTemperatura registro = new RegistroTemperatura(municipio, temperaturas);
		mediciones.add(registro);
	}
		
	public static void main(String[] args) {

		int opcion;
		
		do {
			System.out.println("==================================");
			System.out.println("    SISTEMA METEO-EXTREMADURA 1.0    ");
			System.out.println("==================================");
			System.out.println("1. Añadir registro de Temperatura.");
			System.out.println("2. Añadir registro de Lluvia.");
			System.out.println("3. Mostrar listado general.");
			System.out.println("4. Salir.");
			System.out.println("==================================");
			System.out.println("Elige una opción: ");
			opcion=teclado.nextInt();
			
			
			switch(opcion) {
				case 1:
					aniadirTemperatura();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4: System.out.println("Saliendo del sistema Meteo-Extremadura... ¡Hasta pronto!");
					break;
				default: System.out.println("Opción no válida. Vuelva a intentarlo.");
					break;
			}
		}while(opcion!=4);
		
	}

}
