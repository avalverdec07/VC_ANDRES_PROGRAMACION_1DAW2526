package UT03;

import java.util.Scanner;

/**
 * @author Andres
 */

public class Ascensor {

	private int plantaActual;
	// Si la variable cerrada es true indica que la puerta está cerrada.
	private boolean cerrada;
	
	public Ascensor() {
		plantaActual=1;
		cerrada=true;
	}
	/**
	 * Constructor de la clase
	 * 
	 * @param plantaActual
	 * @param cerrada
	 */
	public Ascensor(int plantaActual, boolean cerrada) {
		this.plantaActual=plantaActual;
		this.cerrada=cerrada;
	}
	
	
	public void subir() {
		plantaActual++;
	}
	
	public void bajar() {
		plantaActual--;
	}
	
	public void abrirPuerta() {
		if (!cerrada) {
			System.out.println("La puerta ya estaba abierta.");
		} else {
			System.out.println("Abriendo puerta.... puerta 	ABIERTA.");
			cerrada=false;
		}

	}
	
	public int getPlantaActual() {
		return plantaActual;
	}
	public void setPlantaActual(int plantaActual) {
		this.plantaActual = plantaActual;
	}
	public boolean isCerrada() {
		return cerrada;
	}
	public void setCerrada(boolean cerrada) {
		this.cerrada = cerrada;
	}
	public void cerrarPuerta() {
		if (cerrada) {
			System.out.println("La puerta ya estaba cerrada.");
		} else {
			System.out.println("Cerrando puerta.... puerta CERRADA.");
			cerrada=true;
		}
	}
	
	public void marcarPlanta(int plantaMarcada) {
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Ascensor elCorteIngles = new Ascensor();
		int opcion;
		
		
		do {
			System.out.println("----- BIENVENIDO AL ASCENSOR -----");
			System.out.println("1. MARCAR PLANTA");
			System.out.println("2. ABRIR PUERTA");
			System.out.println("3. CERRAR PUERTA");
			System.out.println("4. APAGAR");
			opcion=teclado.nextInt();
			
			switch(opcion) {
				case 1:
					break;
				case 2: 
					elCorteIngles.abrirPuerta();
					break;
				case 3:
					elCorteIngles.cerrarPuerta();
					break;
				case 4: System.out.println("--- FIN ---");
					break;
			
			}
			
		} while(opcion!=4);
		
		
	}

}
