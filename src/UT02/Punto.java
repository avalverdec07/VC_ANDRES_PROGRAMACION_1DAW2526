package UT02;

public class Punto {
/*	3. Crea la clase Punto con atributos x e y.
	o Añade un constructor por defecto que inicialice el punto en (0,0).
	o Añade otro constructor que reciba dos parámetros.
	o Escribe un programa que cree tres puntos diferentes y los muestre.
*/

	int x, y;
	
	public Punto() {
		x=0;
		y=0;
	}
	
	public Punto(int a, int b) {
		x=a;
		y=b;
	}
	
	public void mostrarPunto() {
		System.out.println("Las coordenadas del punto son: ("+x+","+y+")");
		
	}

	public static void main(String args[]) {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Punto c = new Punto(-1,-5);
		
		a.mostrarPunto();
		b.mostrarPunto();
		c.mostrarPunto();
		
	}
	
	
	
}
