package UT02.Prueba_Evaluacion;

public class Libreria {

		private String nombre;
		private Libro libroDestacado;
		
		
		public Libreria(String nombre, Libro libroDestacado) {
			this.nombre = nombre;
			this.libroDestacado = libroDestacado;
		}
		
		
		public void mostrarLibreria() {
			System.out.println("\n");
			System.out.println("La librería se llama: "+nombre);
			System.out.println("El libro destacado es: "+libroDestacado.getTitulo());
			
			//libroDestacado.mostrarInfo();
		}
}
