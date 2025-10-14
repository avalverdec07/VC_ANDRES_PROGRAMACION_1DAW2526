package UT02;

public class CompararStrings {

	public static void main(String[] args) {
		
		String a = "hola";
		String b = new String("Hola");
		
		System.out.println(a == b); //  false
		
		System.out.println(a.equalsIgnoreCase(b)); // true
	
		
		// Ejemplo de utilización del método estático parseInt de la clase Integer
		// que convierte una cadena a número entero.
		int suma = Integer.parseInt("123") + 4;
		System.out.println("La suma es: "+suma);
		
		
		
		
		
	}

}
