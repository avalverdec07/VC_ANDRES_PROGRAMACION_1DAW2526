package UT03.Apdo5;

public class UsoPracticoDepurador {

		 public static void main(String[] args) {
			 
		 int[] numeros = {2, 4, 6, 8};
		 
		 int suma = 0;
		 
		 for (int i = 0; i <= numeros.length; i++) { // Error aquí
			 suma += numeros[i];
		 }
		 	System.out.println("Suma: " + suma);
		 }
}
