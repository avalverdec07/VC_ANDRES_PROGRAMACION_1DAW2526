
public class Vehiculo {

	protected String marca;
	protected String color;
	protected double potenciaMotor;

	
	
	public void arrancar() {
		System.out.println("Arranco el coche..."+this.color);
	}
	
	
	public void acelerar() {
		
	}
	
	
	public void frenar() {
		
	}
	
	public void mostrarInformacion() {
		System.out.println("La marca del vehiculo: "+this.marca);
		System.out.println("Color: "+this.color);
		System.out.println("Potencia del motor: "+this.potenciaMotor);

	}
}
