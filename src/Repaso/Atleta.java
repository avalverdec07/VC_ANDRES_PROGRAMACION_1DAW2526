package Repaso;

public class Atleta {
	private String nombre;
	private String pais;
	private double marcaPersonal;
	
	
	public Atleta(String nombre, String pais, double marcaPersonal) {
		this.nombre = nombre;
		this.pais = pais;
		this.marcaPersonal = marcaPersonal;
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
	public String toString() {
		return "["+pais.substring(0, 3).toUpperCase()+"] "+nombre+" - Marca: "+marcaPersonal+".";
	}
	
	
	
	
	
	
}
