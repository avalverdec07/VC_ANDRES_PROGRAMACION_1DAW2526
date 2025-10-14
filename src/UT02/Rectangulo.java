package UT02;

public class Rectangulo {
/*
 * Crea una clase Rectangulo con atributos base y altura, y un método que
 * calcule el área. Escribe un programa de prueba que cree un objeto de esta clase y
 * muestre el área.
 */
	double base, altura;
	
	public void setBase(double b) {
		base = b;
	}
	
	public void setAltura(double a) {
		altura=a;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public static void main(String[] args) {
		// 
		
		Rectangulo miParcela = new Rectangulo();
		
		miParcela.setBase(5.6);
		miParcela.setAltura(4.7);
		
		System.out.printf("El área de mi parcela es de %.2f metros cuadrados", miParcela.calcularArea());
		System.out.println();
		
		String s = "Hola Mundo.";
		System.out.println(s.replaceAll("o","a")); // usando regex -> " Hola Java "

	
		
		System.out.println("El resultado de 7 % 3 es: "+7%3); 
		
		
		
	}

}
