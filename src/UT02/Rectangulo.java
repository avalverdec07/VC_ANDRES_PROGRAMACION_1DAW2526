package UT02;

public class Rectangulo {
/*
 * Crea una clase Rectangulo con atributos base y altura, y un método que
 * calcule el área. Escribe un programa de prueba que cree un objeto de esta clase y
 * muestre el área.
 */
	double base, altura;
	
	public Rectangulo() {
		base=0;
		altura=0;
	}
	
	public Rectangulo(double base, double altura) {
	super();
	this.base = base;
	this.altura = altura;
}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return base*altura;
	}
	
	public double perimetro() {
		return (base+altura)*2;
	}
	
	public static void main(String[] args) {
		/* Primer objeto de la clase Rectángulo. Lo inicializo con el constructor y
		 * y después le asigno la base y altura con los Setters
		 */
		
		
		Rectangulo miParcela = new Rectangulo();
		
		miParcela.setBase(5.6);
		miParcela.setAltura(4.7);
		
		System.out.printf("El área de mi parcela es de %.2f metros cuadrados", miParcela.calcularArea());
		System.out.printf("El perímetro de mi parcela es de %.2f metros cuadrados", miParcela.perimetro());

		System.out.println();
		
		
		/* Segundo objeto de la clase Rectángulo. Lo inicializo con el constructor y
		 * y después le asigno la base y altura con los Setters
		 */
		
		
		Rectangulo miHuerto = new Rectangulo(5.6, 4.7);
		
		
		System.out.printf("El área de mi parcela es de %.2f metros cuadrados", miParcela.calcularArea());
		System.out.printf("El perímetro de mi parcela es de %.2f metros cuadrados", miParcela.perimetro());
		System.out.println();
			
	}

}
