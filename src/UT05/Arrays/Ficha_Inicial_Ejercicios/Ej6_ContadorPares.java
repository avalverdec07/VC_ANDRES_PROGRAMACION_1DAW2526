package UT05.Arrays.Ficha_Inicial_Ejercicios;
/**
 * Crea un array con 20 números enteros (puedes ponerlos a mano o generarlos).
 * Recórrelo y cuenta cuántos números son pares y cuántos son impares.
 * Imprime las estadísticas finales. Ej: "Hay 12 pares y 8 impares".
 * 
 * @author Andrés Valverde
 */
public class Ej6_ContadorPares {

	public static void main(String[] args) {

		int numeros[]=new int[20];

		// Rellenamos el array con números aleatorios del 1 al 100
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100)+1;
			System.out.println("Numeros["+i+"]: "+numeros[i]);
		}
		System.out.println();
		int pares=0;
		int impares=0;
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				pares++;
			} else impares++;
		}
		
		System.out.printf("Hay %d pares %d impares.",pares, impares);
		
	}

}
