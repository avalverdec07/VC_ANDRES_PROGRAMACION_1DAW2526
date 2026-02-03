package UT05.Arrays.Ficha_Avanzada;

/**
 * 
 * Crea un método llamado compactarArray.
 * -Dado un array con huecos dispersos: [5.0, -1.0, 8.5, -1.0, 9.0, -1.0, 4.0].
 * -Debe mover todos los números válidos a la izquierda, eliminando los huecos 
 * intermedios.
 * -Las posiciones sobrantes a la derecha deben rellenarse con -1.0.
 * -Resultado esperado: [5.0, 8.5, 9.0, 4.0, -1.0, -1.0, -1.0].
 * 💡 Pista: Necesitarás dos índices. Uno para recorrer (i) y otro para saber 
 * dónde colocar el siguiente número válido (indiceDestino).
 */

public class Ej1_Desfragmentacion {

	static double numeros[]= {5.0, -1.0, 8.5, -1.0, 9.0, -1.0, 4.0, -1.0, };
	
	public static void compactarArray() {
		int destino = 0;
		for (int i = 0; i< numeros.length; i++) {
			if (numeros[i] != -1) {
				numeros[destino] = numeros[i];
				destino++;
			}
		}
		
		for (int j = destino; j < numeros.length; j++) {
			numeros[j] = -1.0;
		}

	}
	public static void mostrarArray() {
		System.out.print("{");
			for (int i= 0;i <numeros.length; i++) {
				System.out.print(numeros[i]);
				if (i!= (numeros.length-1)) {
					System.out.print(",");
				}
			}
			System.out.print("}");
	}
	
// --- MÉTODO MAIN ---	
	public static void main(String[] args) {
		mostrarArray();
		compactarArray();
		System.out.println();
		mostrarArray();
			
	}// Fin del main.
	
// --- COMPACTAR ARRAY ---
// Fin del método.

}
