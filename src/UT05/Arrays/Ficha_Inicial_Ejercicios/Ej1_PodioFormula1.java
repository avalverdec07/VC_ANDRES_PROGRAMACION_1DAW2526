package UT05.Arrays.Ficha_Inicial_Ejercicios;

public class Ej1_PodioFormula1 {

	public static void main(String[] args) {
		
		String pilotos[]=new String[3];
		
		pilotos[0]="Fernando Alonso";
		pilotos[1]="Lewis Hamilton";
		pilotos[2]="Max Verstappen";
		
		System.out.println("El ganador es "+pilotos[0]+" y el tercero es "+pilotos[2]);
		System.out.println(pilotos[3]);
		
		// EJEMPLO DE CÓMO PODRÍAMOS CAPTURAR LA EXCEPCIÓN
		/*
		try {
			System.out.println(pilotos[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Has intentado acceder a una posición inválida del array.");
		}*/	
	}

}
