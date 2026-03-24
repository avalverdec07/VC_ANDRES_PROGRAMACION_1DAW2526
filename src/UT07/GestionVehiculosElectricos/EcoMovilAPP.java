package UT07.GestionVehiculosElectricos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class EcoMovilAPP {

	private static Scanner entrada = new Scanner(System.in);
	private static List<VehiculoElectrico> concesionario = new ArrayList<>();
	private static int nBicis=0;
	private static int nCoches=0;
	private static int nPatinetes=0;
	
	public static void agregarBicicleta() {
		if (nBicis<5) {
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
			nBicis++;
		} else {
			System.out.println("Lo siento. No puedes insertar más de 5 bicicletas.");
		}
	}
	
public static void agregarPatinete() {
		
		if (nPatinetes<5) {
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
			nPatinetes++;
		} else {
			System.out.println("Lo siento. No puedes insertar más de 5 patinetes.");
		}
	}

public static void agregarCoche() {
	if (nCoches<5) {
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
		nCoches++;
	} else {
		System.out.println("Lo siento. No puedes insertar más de 5 patinetes.");	
		}
}

public static void mostrarVehiculos() {
	
	
	// Iterador (Necesaria si queremos borrar mientras recorremos)
	Iterator<VehiculoElectrico> iterador = concesionario.iterator();
	
	while(iterador.hasNext()) {
	    VehiculoElectrico vehiculo = iterador.next();
	    if (vehiculo instanceof BicicletaElectrica) {
	    	System.out.println("[Bicicleta Eléctrica]");
	    } else if (vehiculo instanceof PatineteElectrico){
	    	System.out.println("[Patinete Eléctrico]");
	    } else if (vehiculo instanceof CocheElectrico){
	    	System.out.println("[Coche Eléctrico]");
	    }
	    vehiculo.mostrarInformacion();
	}
}

public static void cargarVehiculos() {
	
	
	// Iterador (Necesaria si queremos borrar mientras recorremos)
	Iterator<VehiculoElectrico> iterador = concesionario.iterator();
	
	while(iterador.hasNext()) {
	    VehiculoElectrico vehiculo = iterador.next();
	    
	    vehiculo.cargar();
	}
}

public static void borrarVehiculo() {
	
	System.out.println("Introduce la posición del vehículo que quieres borrar: ");
	int posicion = entrada.nextInt();
	
	VehiculoElectrico v = concesionario.get(posicion);
	
	if (v instanceof BicicletaElectrica) {
		nBicis--;
	} else if (v instanceof PatineteElectrico) {
		nPatinetes--;
	}else if (v instanceof CocheElectrico) {
		nCoches--;
	}
	concesionario.remove(posicion);
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
			entrada.nextLine();
			
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
				cargarVehiculos();
				break;
			case 6:
				System.out.println("Has elegido salir.");
				System.out.println("¡Hasta la próxima!");
				break;
			case 7:
				borrarVehiculo();
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while(opcion!=7);
	}

}
