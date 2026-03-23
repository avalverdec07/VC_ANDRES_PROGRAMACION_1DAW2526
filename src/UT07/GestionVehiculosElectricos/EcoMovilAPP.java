package UT07.GestionVehiculosElectricos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EcoMovilAPP {

	private static Scanner entrada = new Scanner(System.in);
	private static List<VehiculoElectrico> concesionario = new ArrayList<>();

	
	public static void agregarBicicleta() {
		
		System.out.println("Introduce la marca: ");
		String marca = entrada.nextLine();
		System.out.println("Introduce el modelo: ");
		String modelo = entrada.nextLine();
		System.out.println("Introduce la autonomía: ");
		int autonomia = entrada.nextInt();
		entrada.nextLine();
		System.out.println("¿Tiene pedales? (true/false): ");
		boolean pedales = entrada.nextBoolean();
		entrada.nextLine();
		BicicletaElectrica bici = new BicicletaElectrica(marca, modelo, autonomia, pedales);
		concesionario.add(bici);
		System.out.println("Bicicleta eléctrica agregada correctamente.");
	}
	
public static void agregarPatinete() {
		
		System.out.println("Introduce la marca: ");
		String marca = entrada.nextLine();
		System.out.println("Introduce el modelo: ");
		String modelo = entrada.nextLine();
		System.out.println("Introduce la autonomía: ");
		int autonomia = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Introduce la potencia del motor (w): ");
		int potencia = entrada.nextInt();
		entrada.nextLine();
		VehiculoElectrico patinete = new PatineteElectrico(marca, modelo, autonomia, potencia);
		concesionario.add(patinete);
		System.out.println("Patinete eléctrico agregado correctamente.");
	}

public static void agregarCoche() {
	
	System.out.println("Introduce la marca: ");
	String marca = entrada.nextLine();
	System.out.println("Introduce el modelo: ");
	String modelo = entrada.nextLine();
	System.out.println("Introduce la autonomía: ");
	int autonomia = entrada.nextInt();
	entrada.nextLine();
	System.out.println("Introduce el número de plazas: ");
	int plazas = entrada.nextInt();
	entrada.nextLine();
	VehiculoElectrico coche = new CocheElectrico(marca, modelo, autonomia, plazas);
	concesionario.add(coche);
	System.out.println("Coche eléctrico agregado correctamente.");
}

public static void mostrarVehiculos() {
	
}
	
	public static void main(String[] args) {

		int opcion;
		System.out.println("Bienvenido a la aplicación EcoMovilAPP.");
		System.out.println();
				
		do {
			System.out.println("=== MENÚ ECO-MOVIL ===");
			System.out.println("1. Agregar una bicicleta eléctrica.");
			System.out.println("2. Agregar un patinete eléctrico.");
			System.out.println("3. Agregar un coche eléctrico.");
			System.out.println("4. Mostrar todos los vehículos registrados.");
			System.out.println("5. Cargar todos los vehículos.");
			System.out.println("6. Salir.");
			System.out.println("Seleccione una opción: ");
			opcion=entrada.nextInt();
			
			switch(opcion) {
			
			case 1: 
				agregarBicicleta();
				break;
			case 2:
				agregarPatinete();
				break;
			case 3:
				agregarCoche();
				break;
			case 4:
				mostrarVehiculos();
				break;
			case 5:
				break;
			case 6:
				System.out.println("Has elegido salir.");
				System.out.println("¡Hasta la próxima!");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while(opcion!=6);
	}

}
