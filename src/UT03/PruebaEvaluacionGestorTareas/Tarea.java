package UT03.PruebaEvaluacionGestorTareas;

/**
 * @author Andrés Valverde
 * @version 1.0
 * 
 * Plantilla de la clase Tarea.
 */


public class Tarea {

	private String nombre;
	private int prioridad;
	private String categoria;
	private double duracionHoras;
	
	
	
	/**
	 * Crea una nueva tarea con nombre y categoria
	 * Se incializacia la duración a 0
	 * y se genera aleatoriamente la prioridad.
	 * 
	 * @param nombre Nombre de la tarea
	 * @param categoria Categoría de la tarea
	 */
	public Tarea(String nombre, String categoria) {
		this.nombre=nombre;
		this.categoria=categoria;
		duracionHoras=0;
		/* Fórmula para generar un número aleatoria entre un mínimo y un máximo.
		 * int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
		 */
		prioridad = (int)(Math.random()*(20-10+1))+10;
	}

	/**
	 * 
	 * @return Devolvemos la duración
	 */
	public double getDuracionHoras() {
		return duracionHoras;
	}

	/**
	 * 
	 * @param duracionHoras Se recibe la duracion y se asigna al atributo
	 */
	public void setDuracionHoras(double duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	/**
	 * 
	 * @return Devolvemos el nombre de la tarea
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @return Devolvemos la prioridad de la tarea generada aleatoriamente
	 */
	public int getPrioridad() {
		return prioridad;
	}

	/**
	 * 
	 * @return Devolvemos a qué categoría pertenece la tarea.
	 */
	public String getCategoria() {
		return categoria;
	}
	
	/**
	 * Muestra por pantalla todos los datos de la tarea.
	 */
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Categoría: "+categoria);
		System.out.println("Duracion: "+duracionHoras);
		System.out.println("Prioridad: "+prioridad);
	}
	

}
