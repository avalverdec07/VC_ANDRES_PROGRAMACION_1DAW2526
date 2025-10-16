package UT02;

import java.util.Random;

public class ejercicioC_Aleatorios {

	public static void main(String[] args) {
		// Genera un número aleatorio entre 1 y 6 (simular un dado) con Math.random()
		
		int dado = (int)(Math.random()*(6-1+1)+1);
		
		System.out.println("Ha salido: "+dado);

	}

}
