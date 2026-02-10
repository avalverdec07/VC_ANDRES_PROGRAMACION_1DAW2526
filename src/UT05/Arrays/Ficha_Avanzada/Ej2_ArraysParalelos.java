package UT05.Arrays.Ficha_Avanzada;
/**
 * 
 * Declara dos arrays:
 * String[] nombres = {"Ana", "Luis", "Pepe", "Maria", "Juan"};
 * double[] notas = {4.5, 8.0, 9.5, 4.5, 7.0};
 * 
 * Se pide crear un método imprimirBoletin que:
 * -Recorra ambos arrays.
 * -Muestre: "El alumno [Nombre] tiene un [Nota]".
 * -Filtrado Avanzado: Solo debe mostrar aquellos alumnos cuya nota sea superior a la media de la clase.
 * 
 */
public class Ej2_ArraysParalelos {
	
	static String[] nombres = {"Ana", "Luis", "Pepe", "Maria", "Juan"};
	static double[] notas = {4.5, 8.0, 9.5, 4.5, 7.0};
	
	public static void imprimirBoletin() {
		for(int i=0; i<nombres.length; i++) {
			System.out.print("El alumno "+nombres[i]+" tiene un "+notas[i]);
			System.out.println();
		}
	}
	
	public static void imprimirSuperiorMedia() {
		double suma=0;
		//Primero calculamos la suma de todas las notas
		for(int i=0; i<notas.length;i++) {
			suma+=notas[i];
		}
		// Después calculamos la media
		double media=(suma/notas.length);
		// Volvemos a recorrer el array imprimiendo solo aquellas notas > media
		for(int i=0; i<nombres.length; i++) {
			if(notas[i]>media) {
				System.out.print("El alumno "+nombres[i]+" tiene un "+notas[i]);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		imprimirBoletin();
		System.out.println("Los alumnos que han obtenido una calificación superior a la media son:");
		imprimirSuperiorMedia();
	}

}
