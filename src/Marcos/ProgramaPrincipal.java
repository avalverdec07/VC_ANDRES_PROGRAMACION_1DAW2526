package Marcos;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
		
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Participante> participantes = new ArrayList<>();

	
	
	
	public static void main(String[] args) {
		
		double [] tiemposReferencia = new double[5];
		
		tiemposReferencia[0] = 30.5;
		tiemposReferencia[1] = 12.3;
		tiemposReferencia[2] = 41.2;
		tiemposReferencia[3] = 80.2;
		tiemposReferencia[4] = 26.9;
		
		int opcion;
		
		do {
			System.out.println("----- MENÚ DE PARTICIPANTES -----");
			System.out.println("1. Añadir corredor");
			System.out.println("2. Añadir Ciclista");
			System.out.println("3. Mostrar participantes");
			System.out.println("4. Mostrar puntuaciones");
			System.out.println("5. Buscar participantes con mayor puntuación");
			System.out.println("6. Analizar nombres");
			System.out.println("7. Mostrar estadisticas de tiempos");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			
			switch (opcion) {
			case 1:
				añadirCorredor();
				break;

			default:
				break;
			}
		} while (opcion != 0);
		
	}

	private static void añadirCorredor() {
		System.out.println("Introduce su nombre");
		String nombreC = sc.nextLine();
		System.out.println("Introduce su edad");
		int edadC = sc.nextInt();
		System.out.println("Introduce su tiempo");
		double tiempoC = sc.nextDouble();
		System.out.println("Introduce su distancia");
		double distanciaC = sc.nextDouble();
		sc.nextLine();
		
		Corredor corredor = new Corredor (nombreC, edadC, tiempoC, distanciaC);
		participantes.add(corredor);
		
	}
}
