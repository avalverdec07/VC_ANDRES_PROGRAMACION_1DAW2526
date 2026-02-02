package UT05.Arrays.Ficha_Inicial_Ejercicios;
/**
 * 
 * Ejercicio 7: Gestión de Stock de "Cerezas del Jerte S.L."
 * Una cooperativa tiene almacenados los kilogramos de cerezas recogidos
 * por 10 trabajadores en un día.
 * 
 * int[] kilosRecogidos = {50, 35, 60, 40, 55, 30, 65, 20, 50, 45};
 * 
 * Se te pide realizar un informe completo:
 * -Total: Muestra cuántos kilos se han recogido en total.
 * -Promedio: ¿Cuál es la media de kilos por trabajador?
 * -Bonus de Productividad: La empresa paga un bonus a quien recoja más de 55kg. 
 *  Muestra el índice (el número de trabajador) de aquellos que recibirán el bonus.
 * 
 * Corrección de errores: El trabajador número 8 (índice 7) se ha quejado; 
 * 	dice que se olvidaron de apuntar su última caja. Súmale 10kg a su registro 
 *  actual antes de hacer los cálculos.
 * 
 * @author Andrés
 * 
 */
public class Ej7_GestionStockCerezas {

	public static void main(String[] args) {

		int[] kilosRecogidos = {50, 35, 60, 40, 55, 30, 65, 20, 50, 45};
		
		// Corrección de errores: sumamos 10kg al trabajador número 8 (índice 7)
		kilosRecogidos[7]+=10;
		
		// Cálculo del total y del promedio.
		int total=0;
		for(int i=0; i<kilosRecogidos.length;i++) {
			total=total+kilosRecogidos[i];
		}
		System.out.println("El total de kilos de cerezas recogidos es de: "+total);
		System.out.println("El promedio de kilos recogidos por trabajador "
				+ "es de: "+(total/kilosRecogidos.length));
		
		System.out.println("Los trabajadores que recibirán el bonus por haber "
				+ "recogido más de 55kg son: ");
		
		for(int i=0; i<kilosRecogidos.length;i++) {
			if(kilosRecogidos[i]>55) {
				System.out.println("Trabajor nº "+(i+1));
			}
		}
	}
}
