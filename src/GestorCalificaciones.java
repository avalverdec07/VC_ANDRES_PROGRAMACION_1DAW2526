

/**
 * @author Pablo López Recio
 * @version 1.0
 * 05/02/2026
 */

import java.util.Scanner;

public class GestorCalificaciones {
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Delcaracion e inicializacion del arraty
	 */
	static double notas[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	

	/**
	 * metodo añadir notas, este nos recoge la nota en una variable double y la posicion en un int u los asigna la nota a la posicion
	 * 
	 */
	public static void añadirModificar() {
		/**
		 * variables
		 */
		int posicion = 0;
		double nota = 0.0;
		
		/**
		 * pedida de valores
		 */
			try {
				System.out.print("Introduzca una posicion(1-10): ");
				posicion = sc.nextInt();
				sc.nextLine();
				System.out.print("Introduzca una nota(0-10): ");
				nota = sc.nextDouble();
				sc.nextLine();
				notas[(posicion-1)] = nota;

				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.print("Valor fuera de rango ");
		}
		
		
		
		/**
		 * asignacion de nota a posicion
		 */
	}
	
	/**
	 * Recoge la posicion a eliminar y le da valor de -1
	 */
	public static void borrar() {
		/**
		 * Variable posicion me recoge la posicion
		 */
		int posicion = 0;
		
		System.out.println("Seleccione posicion a borrar(1-10): ");
		posicion = sc.nextInt();
		sc.nextLine();
		
		notas[posicion] = -1;
		
	}
	
	/**
	 * Me recoge la posicion de origen y la de destino para despues guardad la nota que hay en cada posicion y posteriormente intercambiarlas 
	 */
	public static void intercambiar() {
		int posicionOrg = 0;
		int posicionDes = 0;
		double nota1 = 0;
		double nota2 = 0;
		
		System.out.print("Introduzca la posicion de Origen(1-10): ");
		posicionOrg = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Introduzca la posicion de Destino(1-10): ");
		posicionDes = sc.nextInt();
		sc.nextLine();
		
		nota1 = notas[(posicionOrg-1)];
		nota2 = notas[(posicionDes-1)];
		
		notas[(posicionOrg-1)] = nota2;
		notas[(posicionDes-1)] = nota1;
	}
	
	public static void buscar() {
		double nota = 0;
		int posicion = 0;
		
		System.out.print("Introduce una nota: ");
		nota = sc.nextDouble();
		
		for(int i = 0; i < notas.length;i++) {
			if (notas[i] == nota) {
				posicion = i+1;
				System.out.println("Nota en posicion: "+posicion);
			}
		}
		if (posicion == 0) {
			System.out.println("nota"+nota+"no encontrada");
		}
	}
	
	public static void media() {
		double suma = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] != -1) {
				suma = suma + notas[i];
			}
			
		}
		
		media = suma/notas.length;
		
		System.out.println("La media de todas las notas es de: "+media);
	}
	
	public static void maxima() {
		double maxima = notas[0];
		for(int i = 1; i < notas.length; i++) {
			if(notas[i] != -1) {
				if (notas[i] > maxima) {
					maxima = notas[i];
				}
			}
		}
		System.out.println("La nota más alta es: "+maxima);
	}
	
	public static void minima() {
		double minima = notas[0];
		for(int i = 1; i < notas.length; i++) {
			if (minima==-1) minima=notas[i];
			if(notas[i] != -1) {
				if (notas[i] < minima) {
					minima = notas[i];
				}
			}
		}
		System.out.println("La nota más baja es: "+minima);
	}
	
	public static void listar() {
		for(int i = 0; i < notas.length; i++) {
			if (notas[i] == -1) {
				System.out.println((i+1)+"Sin calificar");
			}else {
				System.out.println((i+1)+"="+notas[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//GestorCalificaciones notas = new GestorCalificaciones();
		
		int opcion = 0;
		
		do {
			System.out.println("Elige una opcion \n 1.Registrar/Modificar notas \n 2.Borrar notas \n 3.Intercambiar Notas \n 4.Buscar nota \n 5.Calcualar estadistica \n 6.Listar notas \n 7.Salir");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				añadirModificar();
				break;
			case 2:
				borrar();
				break;
			case 3:
				intercambiar();
				break;
			case 4:
				buscar();
				break;
			case 5:
				media();
				maxima();
				minima();
				break;
			case 6:
				listar();
				break;
			}
			
			
		}while(opcion != 7);
		System.out.println("Saliendo...");
		teclado.close();
	}
}
