package UT07.GestionVehiculosElectricos;

public class VehiculoElectrico {

	private String marca;
	private String modelo;
	private int autonomia;
	
	public VehiculoElectrico(String marca, String modelo, int autonomia) {
		this.marca = marca;
		this.modelo = modelo;
		this.autonomia = autonomia;
	}
	
	public void mostrarInformacion() {
		System.out.print("Marca: "+marca+" - ");
		System.out.print("Modelo: "+modelo+" - ");
		System.out.print("Autonomía: "+autonomia+" km. - ");
	}
	
	@Override
	public String toString() {
		return "VehiculoElectrico marca=" + marca + ", modelo=" + modelo + ", autonomia=" + autonomia + "]";
	}

	public void cargar() {
		System.out.println("Cargando vehículo eléctrico...");
	}
	
}
