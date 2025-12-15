package UT03.PruebaEvaluacionGestorTareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTareas {

	
	public static void main(String[] args) {		

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("REGISTRO DE LAS TRES TAREAS:");
	/* --- PEDIMOS DATOS TAREA 1 ---*/
	System.out.println("Tarea 1:");
	System.out.println("Introduce el nombre de la Tarea 1:");
	String nombre = teclado.nextLine();
	System.out.println("Introduce la categoria:");
	String categoria = teclado.nextLine();
	double duracion=0;
	try {
		do {
			System.out.println("Introduce la duración en horas:");
			duracion = teclado.nextDouble();
			teclado.nextLine(); // Limpiamos el buffer para recoger el salto de línea.
			if (duracion<0.5||duracion>12) {
				System.out.println("Duración fuera de rango (0.5-12)");
			}
		} while(duracion<0.5||duracion>12);
	} catch(NumberFormatException e) {
		System.out.println("ERROR: Debe introducir un número válido.");
	}
	
	Tarea miTarea1 = new Tarea(nombre, categoria);
	miTarea1.setDuracionHoras(duracion);
	System.out.println("La prioridad generada automáticamente es: "+miTarea1.getPrioridad());
	
	/* --- PEDIMOS DATOS TAREA 2---*/
	System.out.println("Tarea 2:");
	System.out.println("Introduce el nombre de la Tarea 2:");
	nombre = teclado.nextLine();
	System.out.println("Introduce la categoria:");
	categoria = teclado.nextLine();
	try {
		do {
			System.out.println("Introduce la duración en horas:");
			duracion = teclado.nextDouble();
			teclado.nextLine(); // Limpiamos el buffer para recoger el salto de línea.
			if (duracion<0.5||duracion>12) {
				System.out.println("Duración fuera de rango (0.5-12)");
			}
		} while(duracion<0.5||duracion>12);
	} catch(NumberFormatException e) {
		System.out.println("ERROR: Debe introducir un número válido.");
	}
	
	Tarea miTarea2 = new Tarea(nombre, categoria);
	miTarea2.setDuracionHoras(duracion);
	System.out.println("La prioridad generada automáticamente es: "+miTarea2.getPrioridad());
	
	
	/* --- PEDIMOS DATOS TAREA 3 ---*/
	
	System.out.println("Tarea 3:");
	System.out.println("Introduce el nombre de la Tarea 3:");
	nombre = teclado.nextLine();
	System.out.println("Introduce la categoria:");
	categoria = teclado.nextLine();
	try {
		do {
			System.out.println("Introduce la duración en horas:");
			duracion = teclado.nextDouble();
			teclado.nextLine(); // Limpiamos el buffer para recoger el salto de línea.
			if (duracion<0.5||duracion>12) {
				System.out.println("Duración fuera de rango (0.5-12)");
			}
		} while(duracion<0.5||duracion>12);
	} catch(InputMismatchException e) {
		System.out.println("ERROR: Debe introducir un número válido.");
	}
	
	Tarea miTarea3 = new Tarea(nombre, categoria);
	miTarea3.setDuracionHoras(duracion);
	System.out.println("La prioridad generada automáticamente es: "+miTarea3.getPrioridad());
	
	/* --- MENÚ PRINCIPAL ---*/
	int opcion;
	do {
		System.out.println("MENÚ DE OPCIONES:");
		System.out.println("1. Mostrar todas las tareas.");
		System.out.println("2. Mostrar tarea con mayor prioridad.");
		System.out.println("3. Buscar tarea por nombre.");
		System.out.println("4. Promedio redondeado de duración.");
		System.out.println("5. Filtrar tareas por prioridad mínima.");
		System.out.println("6. Salir.");
		System.out.println("Elige una opción: ");
		
		opcion=teclado.nextInt();
		teclado.nextLine(); // Limpiamos el buffer.
		
		switch(opcion) {
			case 1:
				System.out.println("Has elegido la opción 1:");
				System.out.println("--- TAREAS REGISTRADAS ---");
				System.out.println("Tarea 1: ");
				miTarea1.mostrar();
				System.out.println("Tarea 2: ");
				miTarea2.mostrar();
				System.out.println("Tarea 3: ");
				miTarea3.mostrar();
				break;
			case 2:
				System.out.println("Has elegido la opción 2:");
				System.out.println("La tarea con mayor prioridad es:");
				if (miTarea1.getPrioridad()>miTarea2.getPrioridad()&&miTarea1.getPrioridad()>miTarea3.getPrioridad()) {
					System.out.println(miTarea1.getNombre()+"(Prioridad:"+miTarea1.getPrioridad()+")");
				} else if (miTarea2.getPrioridad()>miTarea1.getPrioridad()&&miTarea2.getPrioridad()>miTarea3.getPrioridad()) {
					System.out.println(miTarea2.getNombre()+"(Prioridad:"+miTarea2.getPrioridad()+")");
				} else {
					System.out.println(miTarea3.getNombre()+"(Prioridad:"+miTarea3.getPrioridad()+")");
				}
				break;
			case 3:
				System.out.println("Has elegido la opción 3:");
				System.out.println("Introduce el nombre de la tarea a buscar: ");
				String tareaBuscada = teclado.nextLine();
				if (tareaBuscada.equalsIgnoreCase(miTarea1.getNombre())) {
					System.out.println("Tarea encontrada:");
					miTarea1.mostrar();
				} else if (tareaBuscada.equalsIgnoreCase(miTarea2.getNombre())) {
					System.out.println("Tarea encontrada:");
					miTarea2.mostrar();
				} else if (tareaBuscada.equalsIgnoreCase(miTarea3.getNombre())) {
					System.out.println("Tarea encontrada:");
					miTarea3.mostrar();
				} else {
					System.out.println("No existe ninguna tarea con ese nombre.");
				}
				break;
			case 4:
				System.out.println("Has elegido la opción 4:");
				double promedio=0;
				for(int i=1; i<=3; i++) {
					if (i==1) {
						promedio=promedio+miTarea1.getDuracionHoras();
					} else if (i==2) {
						promedio=promedio+miTarea2.getDuracionHoras();
					} else if (i==3) {
						promedio=promedio+miTarea3.getDuracionHoras();
					}
				}
				System.out.println("Duraciones totales calculadas mediante bucle: "+promedio+" horas");
				System.out.println("Promedio exacto: "+(promedio/3));
				System.out.println("Promedio redondeado (Math.round): "+Math.round(promedio/3));
				
				break;
			case 5:
				System.out.println("Has elegido la opción 5:");
				double prioridadMinima=0;
				boolean correcto=true;
				do {
					try {
						System.out.println("Introduce la prioridad mínima: ");
						prioridadMinima = teclado.nextInt();
						correcto=true;
					} catch (NumberFormatException e) {
						correcto=false;
						System.out.println("ERROR: Debe introducir un número entero válido.");
					}
				}while(!correcto);
				System.out.println("Tareas con prioridad mayor o igual a "+prioridadMinima+": ");
				for(int i=1; i<=3; i++) {
					if (i==1) {
						if (miTarea1.getPrioridad()>=prioridadMinima) {
							miTarea1.mostrar();
						} else continue;
					} else if (i==2) {
						if (miTarea2.getPrioridad()>=prioridadMinima) {
							miTarea2.mostrar();
						} else continue;
					} else if (i==3) {
						if (miTarea3.getPrioridad()>=prioridadMinima) {
							miTarea3.mostrar();
						} else continue;
					}
				}
				break;
			case 6: 
				System.out.println("Has elegido salir. ¡Hasta luego!");
				break;
			default:
				System.out.println("Opción incorrecta.");
		}
	}while(opcion!=6);
	
	
	
	
		
		
	}
	

	

}
