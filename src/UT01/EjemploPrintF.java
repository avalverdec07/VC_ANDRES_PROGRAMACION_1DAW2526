package UT01;

public class EjemploPrintF {

	public static void main(String[] args) {
		
		// Ejemplo de printf con números enteros y saldo de línea.
		
		 System.out.printf("La mitad de %d es %d \n y suman %d. \n", 42, 21, 63);
		 
		/* Ejemplo de printf con números double e imprimiendo en columnas
		*  El número antes del punto indica el nº de espacios que se dejan después
		*  de imprimir y el nº después del punto indica el nº de decimales.
		*/
		System.out.println("");
		double precio = 255.75;
		System.out.printf("%-7s %-5.2f %s\n", "El precio es: ", precio,"€");
		System.out.printf("%-7s %-5.2f %s\n", "El precio es: ", precio,"€");
		System.out.printf("%-7s %-5.2f %s\n", "El precio es: ", precio,"€");

		
		 
		 
	} 

}





