package UT07.GestionVehiculosElectricos;


public class PatineteElectrico extends VehiculoElectrico {

	private int potenciaMotor;

	public PatineteElectrico(String marca, String modelo, int autonomia, int potenciaMotor) {
		super(marca, modelo, autonomia);
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println("Potencia del motor: "+this.potenciaMotor);
	}

	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Cargando patinete eléctrico...");
	}
	
	
	
	
}
