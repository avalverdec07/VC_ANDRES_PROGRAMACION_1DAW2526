package Repaso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorCompeticion {

	static ArrayList<Atleta> participantes = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void inscribirAtleta() {
		String nombre, pais;
		double marca;
		
		System.out.println("Introduce el nombre del atleta: ");
		nombre=teclado.nextLine();
		
		System.out.println("Introduce el país del atleta: ");
		pais=teclado.nextLine();
	
		while(true) {
			System.out.println("Introduce la marca personal del atleta: ");
			marca=teclado.nextDouble();
			teclado.nextLine();
			
			if(marca<0) {
				System.out.println("Error. La marca personal no puede ser negativa.");
				continue;
			} else {
				break;
			}
		}
		
		Atleta corredor = new Atleta(nombre, pais, marca);
		participantes.add(corredor);
		System.out.println("Participante añadido correctamente.");
		
	}

	
	public static void retirarAtleta() {
		
		System.out.println("Introduce el nombre del atleta a borrar: ");
		String nombre = teclado.nextLine();
		boolean encontrado=false;
		
		
		for (int i=0; i<participantes.size(); i++) {
			
			if (nombre.equalsIgnoreCase(participantes.get(i).getNombre())) {
				participantes.remove(i);
				encontrado=true;
				System.out.println("Participante eliminado correctamente.");
				break;
			}
		}
		if(encontrado==false) {
			System.out.println("El atleta no ha sido encontrado y no se ha podido eliminar.");
		}
		
	}
	
	public static void buscarAtleta() {
		String pais;
		
		boolean encontrado=false;
		int contador=0;
		
		System.out.println("Introduce un país para listar sus participantes: ");
		pais=teclado.nextLine();
		
		for(Atleta a : participantes) {
			if(a.getPais().equalsIgnoreCase(pais)) {
				System.out.println(a.toString());
				encontrado=true;
				contador++;
			}
		}
		
		// Forma 1
		if (encontrado==false) {
			System.out.println("No hay ningún participante de ese país.");
		}
		
		//Forma 2, con un contador.
		System.out.println("Hay "+contador+ " participantes de ese país.");	
		
		
	}
	
	
	public static void listarParticipantes() {
		
		for(Atleta a : participantes) {
			System.out.println(a.toString());
		}
	}
	
	
	public static void main(String[] args) {
		int opcion = 0;
		
		
		do {
		
			System.out.println("===== GESTOR COMPETICION =====");
			System.out.println("Elije una opcion:");
			System.out.println("1. Inscribir atleta.");
			System.out.println("2. Retirar atleta.");
			System.out.println("3. Buscar atleta por país.");
			System.out.println("4. Intercambiar orden de salto.");
			System.out.println("5. Cálculo de rendimiento.");
			System.out.println("6. Listar participantes.");
			System.out.println("7. Salir.");
			
			try { 
				opcion=teclado.nextInt();
			}
			catch(InputMismatchException error) {
				System.out.println("Error. Debes introducir un número entre 1 y 7.");
			}
			
			teclado.nextLine();
			
			switch(opcion) {
			
			case 1:
				inscribirAtleta();
				break;
			case 2:
				retirarAtleta();
				break;
			case 3:
				buscarAtleta();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				listarParticipantes();
				break;
			case 7:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			
			}
			
		}while(opcion!=7);
	
	}

}
