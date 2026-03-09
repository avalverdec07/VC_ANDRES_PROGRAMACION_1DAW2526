package UT05.Colecciones.GestorCompetecionesAtletismo;
/**
 * @author Andrés Valverde
 *  
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorCompeticion {

	static Scanner teclado = new Scanner(System.in);
	static List<Atleta> participantes = new ArrayList<>();
	
	/**
	 * Pide los datos y añade un atleta al ArrayList participantes.
	 */
	public static void InscribirAtleta(){

		System.out.println("HAS ELEGIDO: INSCRIBIR ATLETA.");
		System.out.println("Introduce el nombre del Atleta: ");
		String nom =teclado.nextLine();
		System.out.println("Introduce el país del Atleta: ");
		String pais = teclado.nextLine();
		double marcaPersonal=0;
		while(true) {
			System.out.println("Introduce la marca personal del Atleta: ");
			marcaPersonal = teclado.nextDouble();
			if (marcaPersonal<0) {
				continue;
			} else break; 
		}
		
		Atleta atleta = new Atleta(nom, pais, marcaPersonal);
		participantes.add(atleta);
	}
	
	public static void RetirarAtleta(){
		System.out.println("HAS ELEGIDO: RETIRAR ATLETA.");
		System.out.println("Introduce el nombre del Atleta: ");
		String nom =teclado.nextLine();
		boolean existe=false;
		
		for(int i=0; i<participantes.size(); i++) {
			if (participantes.get(i).getNombre().equalsIgnoreCase(nom)) {
				existe=true;
				participantes.remove(i);
			}
		}
		if (existe) {
			System.out.println("Se ha eliminado correctamente.");
		} else {
			System.out.println("Atleta no encontrado. No existe.");
		}
	}
	
	public static void BuscarAtletaPorPais() {
		System.out.println("Introduce las tres primeras letras del país: ");
		String letras = teclado.nextLine();
		for(Atleta a : participantes) {
			if (a.getPais().substring(0, 3).equalsIgnoreCase(letras)) {
				System.out.println(a.toString());
			}
		}
		}
	
	public static void IntercambiarOrdenSalto() {
		System.out.println("Vas a intercambiar dos atelas de orden.");
		System.out.println("Introduce la posición del 1er atleta:");
		int origen = teclado.nextInt();
		System.out.println("Introduce la posición del 2o atleta:");
		int destino = teclado.nextInt();
	
		Atleta aux;
		//Primero necesitamos guardar temporalmente uno de los dos.
		try { 
			aux= participantes.get(destino);
			
			participantes.set(destino,participantes.get(origen));
			participantes.set(origen,aux);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Índices no válidos.");
		}
	}
	
	public static void CalculoRendimiento() {
		
		double maximo=participantes.get(0).getMarcaPersonal();
		
		for(int i=1; i<participantes.size();i++) {
			maximo=Math.max(maximo, participantes.get(i).getMarcaPersonal());
		}
		System.out.println("La marca ganadora es: "+maximo+" metros.");
		double indice = Math.round(Math.sqrt(maximo)*10);
		System.out.println("El índice de potencia del ganador es: "+indice);
		for(Atleta a : participantes) {
			if (maximo==a.getMarcaPersonal()) {
				System.out.println("El atleta ganador es: ");
				System.out.println(a.getNombre());
			}
		}
	}
	
	public static void ListarParticipantes() {
		for(Atleta atleta : participantes) {
			System.out.println(atleta.toString());
		}
	}
	
	public static void main(String[] args) {
		int opcion=0;
		
		System.out.println("Bienvenido al Gestor de Competiciones de Atletismo...");
		
		do {
			System.out.println("Elige una de las siguientes opciones: ");
			System.out.println("1 - Inscribir Atleta.");
			System.out.println("2 - Retirar Atleta.");
			System.out.println("3 - Buscar Atleta por país.");
			System.out.println("4 - Intercambiar Orden de Salto.");
			System.out.println("5 - Cálculo de Rendimiento.");
			System.out.println("6 - Listar participantes.");
			System.out.println("7 - Salir.");
			System.out.println("Opción: ");
			opcion=teclado.nextInt();
			teclado.nextLine();
			
			
			switch(opcion) {
			case 1:
				InscribirAtleta();
				break;
			case 2:
				RetirarAtleta();
				break;
			case 3:
				BuscarAtletaPorPais();
				break;
			case 4:
				IntercambiarOrdenSalto();
				break;
			case 5:
				CalculoRendimiento();
				break;
			case 6:
				ListarParticipantes();
				break;
			case 7:
				System.out.println("Has elegido salir. ¡Hasta la próxima!");
				break;
			}
		}while(opcion!=7);
		
	}

}
