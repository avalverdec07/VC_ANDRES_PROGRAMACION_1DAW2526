package UT07.GestionVehiculosElectricos;

public class CocheElectrico extends VehiculoElectrico{

	private int numeroPlazas;

	public CocheElectrico(String marca, String modelo, int autonomia, int numeroPlazas) {
		super(marca, modelo, autonomia);
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println("Número de plazas: "+this.numeroPlazas);
	}

	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Cargando coche eléctrico...");
	}
	
	
}
