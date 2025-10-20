package UT02;

public class ejercicio4_5_Coche {

	public static void main(String[] args) {
	/* 1. Crea una clase Coche con atributos marca y año. Define:
	 * 		o un constructor por defecto que asigne "Sin marca" y 2000.
	 * 		o un constructor con parámetros que inicialice ambos atributos.
	 * Escribe un programa que cree dos coches, uno con cada constructor, y muestre
	 * sus datos.
	 */
	
		Coche miPrimerCoche = new Coche();
		Coche miSegundoCoche = new Coche("Ferrari", 2025);
		
		miPrimerCoche.mostrarCoche();
		miSegundoCoche.mostrarCoche();
				
	}

}
