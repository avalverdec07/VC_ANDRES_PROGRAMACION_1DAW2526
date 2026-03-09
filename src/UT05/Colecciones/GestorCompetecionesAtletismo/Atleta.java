package UT05.Colecciones.GestorCompetecionesAtletismo;
/**
 * @author Andrés Valverde
 * Clase que almacena los datos de un atleta.
 * 
 */
public class Atleta {

	private String nombre;
	private String pais;
	private double marcaPersonal;
	
	/**
	 * Constructor que inicializa el nombre, país y marca.
	 * 
	 * @param nombre
	 * @param pais
	 * @param marcaPersonal
	 */
	public Atleta(String nombre, String pais, double marcaPersonal) {
		this.nombre = nombre;
		this.pais = pais;
		this.marcaPersonal = marcaPersonal;
	}
	public Atleta() {
		this.nombre="";
		this.pais="";
		this.marcaPersonal=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getMarcaPersonal() {
		return marcaPersonal;
	}

	public void setMarcaPersonal(double marcaPersonal) {
		this.marcaPersonal = marcaPersonal;
	}

	@Override
	/**
	 * @return Devuelve un String con los datos del Atleta en un formato concreto.
	 */
	public String toString() {
		return "["+pais.substring(0,3).toUpperCase()+
				"] "+this.nombre+" - Marca: "+this.marcaPersonal ;
	}
}
