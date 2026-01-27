
public class Moto extends Vehiculo {
	String tipoTraccion;
	
	public Moto(String marca, String color, String tipoTrac) {
		this.color=color;
		this.marca=marca;
		this.tipoTraccion=tipoTrac;
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Arranco la moto...");
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println("Tipo traccion: "+this.tipoTraccion);
	}
	

	
	
	
}
