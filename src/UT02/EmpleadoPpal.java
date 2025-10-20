package UT02;

import java.util.Scanner;

public class EmpleadoPpal {

	public static void main(String[] args) {
		//Este es el programa principal que utiliza la clase Empleado
		//String nombre;
		double salario;
		
		Empleado operario = new Empleado("Sin nombre", 0);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del empleado: ");
				
		// Pedimos por teclado el nombre y directamente se lo pasamos como parámetro
		// al método setNombre del objeto "operario"
		operario.setNombre(teclado.nextLine());
		
		System.out.println("Introduce el salario del empleado: ");
		salario = teclado.nextDouble();
		
		operario.setSalario(salario);
		
		operario.mostrarInfo();
		
		System.out.println("¿En cuánto quieres aumentar el salario al empleado?: ");
		double aumento = teclado.nextDouble();
		teclado.nextLine();
		operario.aumentarSalario(aumento);

		operario.mostrarInfo();

		/* ********************************************************* */
		// Segundo empleado. Otra forma de hacerlo sería primero pedir los datos
		// y después instanciar el objeto invocando el construtor para inicializarlos
		// con los datos introducidos por el usuario.
		
		System.out.println("Introduce el nombre del limpiador: ");
		String nombre = teclado.nextLine();
		System.out.println("Introduce el salario del limpiador: ");
		double salLimpiador = teclado.nextDouble();
		
		Empleado limpiador = new Empleado(nombre, salLimpiador);
		limpiador.mostrarInfo();
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
