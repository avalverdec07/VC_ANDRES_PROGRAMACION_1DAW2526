package UT03.PruebaEvaluacionGestorMensajes;
/**
 * @author Andrés Valverde
 * @version 1.0
 * 
 * Definición de la clase Mensaje
 */
public class Mensaje {

	private String autor;
	private String contenido;
	private int longitud;
	private int palabras;
	
	/**
	 * Crea un nuevo mensaje inicializando el autor y el contenido
	 * y llama al método calcularLongitudPalabras para que calcule
	 * los atributos longitud y palabras.
	 * 
	 * @param autor
	 * @param contenido
	 */
	public Mensaje(String autor, String contenido) {
		this.autor=autor;
		this.contenido=contenido;
		calcularLongitudPalabras();		
	}
	
	
	/**
	 * 
	 * @return contenido
	 */
	public String getContenido() {
		return contenido;
	}


	/**
	 * 
	 * @param contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	/**
	 * 
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * 
	 * @return longitud
	 */
	public int getLongitud() {
		return longitud;
	}


	/**
	 * 
	 * @return palabras
	 */
	public int getPalabras() {
		return palabras;
	}


	/**
	 * Este método recorre el atributo contenido y va calculando
	 * la longitud sin espacios y el número de palabras.
	 */
	public void calcularLongitudPalabras() {
		// Vamos a calcular la longitud y el número de palabras
				longitud=0;
				palabras=1;
				for(int i=0; i<contenido.length(); i++) {
					if (contenido.charAt(i)!=' ') {
					longitud++;
				} else {
					palabras++;
					}
				}
	}
	
	/**
	 * Mostramos todos los atributos de la clase Mensaje
	 */
	public void mostrar() {
		System.out.println("Autor: "+autor);
		System.out.println("Contenido: "+contenido);
		System.out.println("Longitud sin espacios: "+longitud);
		System.out.println("Palabras: "+palabras);
	}
	
}
