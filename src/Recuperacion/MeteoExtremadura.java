package Recuperacion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MeteoExtremadura {

	
		static ArrayList<RegistroMeteo> registroMeteo = new ArrayList<>();
		static Scanner entrada = new Scanner(System.in);
		static String muni;

		
	public static void aniadirTemperatura() {
		
		double temp[] = new double[3];
		
		System.out.println("--- NUEVO REGISTRO DE TEMPERATURA ---");
		System.out.println("Introduce el municipio: ");
		muni = entrada.nextLine();
		for(int i=0; i<3; i++) {
			System.out.print("Introduce la temperatura del ");
			switch(i) {
			case 0: 
				System.out.print("viernes: ");
				break;
			case 1: 
				System.out.print("sábado: ");
				break;
			case 2: 
				System.out.print("domingo: ");
				break;
			} // Fin del switch
			temp[i]=entrada.nextDouble();
			entrada.nextLine();
		} // Fin del for
		
		//Creamos objeto RegistroTemperatura
		RegistroTemperatura registro = new RegistroTemperatura(muni, temp);
		
		//Añadimos el objeto al ArrayList
		registroMeteo.add(registro);
		System.out.println("> Registro añadido correctamente.");
	}
	
	
	public static void aniadirLluvia() {
		double litros;
		
		System.out.println("--- NUEVO REGISTRO DE LLUVIA ---");
		System.out.println("Introduce el municipio: ");
		muni=entrada.nextLine();
		
		System.out.println("Introduce los litros por metro cuadrado: ");
		litros=entrada.nextDouble();
		
		RegistroLluvia registro = new RegistroLluvia(muni, litros);
		
		registroMeteo.add(registro);
		
		System.out.println("> Registro añadido correctamente.");
	}
	
	public static void mostrarListadoGeneral() {
		
		
		
		for(RegistroMeteo elemento : registroMeteo) {
			
			System.out.println(elemento.toString());
			System.out.println(elemento.evaluarAlerta());

			if (elemento instanceof RegistroTemperatura) {
				RegistroTemperatura reg =(RegistroTemperatura)elemento;
				System.out.println("Índice de volatilidad: "+ reg.calcularVolatilidad());
			}

		}

	}
	
	
	public static void main(String[] args) {

		int opcion = 0;
		
		do {
			System.out.println("==========================================");
			System.out.println("     SISTEMA METEO EXTREMADURA (v1.0)     ");
			System.out.println("==========================================");
			System.out.println("1. Añadir Registro de Temperatura.");
			System.out.println("2. Añadir Registro de Lluvia.");
			System.out.println("3. Mostrar listado general.");
			System.out.println("4. Salir.");
			System.out.println("==========================================");
			System.out.println("Elige una opción: ");
	
			try {
				opcion=entrada.nextInt();
			} catch(InputMismatchException error) {
				System.out.println("Error: debes introducir un número de opción entre 1 y 4.");
			}
			entrada.nextLine();
			switch(opcion) {
			
			case 1: 
				aniadirTemperatura();
				break;
			case 2: 
				aniadirLluvia();
				break;
			case 3: 
				mostrarListadoGeneral();
				break;
			case 4: 
				System.out.println("Saliendo del sistema Meteo-Extremadura... ¡Hasta pronto!");
				break;
			default: 
				System.out.println("Opción no válida. Vuelve a intentarlo.");
				break;
						
			}
	
			
		} while (opcion!=4);

		
		
		
		

		
	}

}
