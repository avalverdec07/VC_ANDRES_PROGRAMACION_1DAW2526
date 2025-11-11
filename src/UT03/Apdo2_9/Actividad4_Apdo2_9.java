package UT03.Apdo2_9;

public class Actividad4_Apdo2_9 {

	public static void main(String[] args) {
		/* 4. Dibujar con asteriscos.
		 * Crea un programa que dibuje un triángulo de asteriscos usando bucles anidados
		 */
		/* En cada fila imprime un asterísco más
		 * El primer bucle for son las filas y en el segundo bucle for
		 * imprime tantos asteríscos como indique el número de fila en que nos encontremos.
		 */
		for (int fila=0; fila<10; fila++) {
			for (int columna=0; columna<fila; columna++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
