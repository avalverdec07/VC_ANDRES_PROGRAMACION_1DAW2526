package UT05.Arrays.Ficha_Inicial_Ejercicios;
/*
 * Programa que pide notas y hace cálculos.
 * 
 * @author Andrés Valverde.
 * @version 1.0
 * 
 * Pide al usuario (usando Scanner) que introduzca sus notas de los 5 módulos
 * del curso. 
 * 1. Guárdalas en un array double[] notas. 
 * 2. Usa un bucle para recorrer el array y sumar todas las notas.
 * 3. Calcula la media y muéstrala.
 * 
 * Extra: Si la media es menor a 5, imprime "Toca estudiar más en la recuperación".
 */
import java.util.Scanner;

public class Ej4_NotaMediaCiclo {

	//Constante para el tamaño del array.
	final static int TAMAÑO=5;
	//Declaramos el array como una variable global de la clase (estática)
	static double notas[]= new double[TAMAÑO];

//-----------MÉTODO MAIN---------------------------------------------------------

	public static void main(String[] args) {
		pedirDatos();
		mostrarDatos();
	}// Fin del main
	

//------- MÉTODO CALCULAR SUMA NOTAS --------------------------------------

/**
 * Método que recorre el array y va sumando todas las notas	
 * @return Resultado de la suma
 */
	public static double calcularSumaNotas() {
		double sumaNotas=0;
		for(int i=0; i<notas.length;i++) {
			sumaNotas=sumaNotas+notas[i];
		}
		
		return sumaNotas;
	}// Fin del método.

//-------  MÉTODO PARA PEDIR LOS DATOS AL USUARIO-------------------------------------	
	/**
	 * Método que pide notas al usuario y las almacena en un array	
	 * 
	 */
public static void pedirDatos() {
	Scanner teclado = new Scanner(System.in);
	for(int i=0; i<TAMAÑO;i++) {
		System.out.print("Introduce la nota del módulo nº"+(i+1)+": ");
		notas[i]=teclado.nextDouble();
		teclado.nextLine();
		System.out.println();
	}
}// Fin del método.
	
//-------  MÉTODO PARA MOSTRAR LOS CÁLCULOS-------------------------------------	
/**
 * Método que muestra la suma y la nota media.
 */
public static void mostrarDatos() {
	System.out.println("La suma total de las notas es: "+calcularSumaNotas());
	System.out.println("La nota media es: "+(calcularSumaNotas()/TAMAÑO));
}

}// Fin de la clase
