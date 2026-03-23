package UT07.GestionVehiculosElectricos;

public class BicicletaElectrica extends VehiculoElectrico {

	private boolean tienePedales;

	public BicicletaElectrica(String marca, String modelo, int autonomia, boolean tienePedales) {
		super(marca, modelo, autonomia);
		this.tienePedales = tienePedales;
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println("Tiene pedales: "+this.tienePedales);
	}

	@Override
	public void cargar() {
		System.out.println("Cargando bicicleta eléctrica...");
		
	}
	
	
	
	
}
