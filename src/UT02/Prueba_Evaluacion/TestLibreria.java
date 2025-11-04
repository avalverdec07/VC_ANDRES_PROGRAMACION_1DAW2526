package UT02.Prueba_Evaluacion;

import java.util.Scanner;

public class TestLibreria {
	
	public static void main(String args[]) {
		String tit, aut, coment;
		double pre, porcen;
		
		Libro antonio = new Libro();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el título del libro: ");
		tit = teclado.nextLine();
		System.out.println("Introduce el autor del libro: ");
		aut = teclado.nextLine();
		System.out.println("Introduce el comentario del libro: ");
		coment = teclado.nextLine();
		System.out.println("Introduce el precio del libro: ");
		pre = teclado.nextDouble();
		System.out.println("Introduce el porcentaje de descuento a aplicar: ");
		porcen = teclado.nextDouble();

		Libro miLibro = new Libro(tit, aut, pre, coment);
		
		System.out.println("--- Resultado ---");
		
		miLibro.procesarComentario();
		double precioFinal = Descuento.calcularPrecioConDescuento(pre, porcen);
		
		Libreria miLibreria = new Libreria("Lecturas Java", miLibro);
		
		miLibro.mostrarInfo();
		System.out.println("El precio final con descuento es: "+precioFinal);
		miLibreria.mostrarLibreria();
}	
}
