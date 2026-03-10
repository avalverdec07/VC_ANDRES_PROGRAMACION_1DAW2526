package UT05.IntercambioDatos;

import java.util.List;


public class Prevision {
	private String ciudad;
	private double temperatura;
	private List <String> alertas;
	
	public Prevision(String ciudad, double temperatura, List<String> alertas) {
		this.ciudad = ciudad;
		this.temperatura = temperatura;
		this.alertas = alertas;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public List<String> getAlertas() {
		return alertas;
	}
	public void setAlertas(List<String> alertas) {
		this.alertas = alertas;
	}
	
	
	
}
