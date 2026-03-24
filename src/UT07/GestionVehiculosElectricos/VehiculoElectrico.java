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
		System.out.print("Marca: "+this.marca+" - ");
		System.out.print("Modelo: "+this.modelo+" - ");
		System.out.print("Autonomía: "+this.autonomia+" km. - ");
	}
	
	public void cargar() {
		System.out.println("Cargando vehículo eléctrico...");
	}
	
}
