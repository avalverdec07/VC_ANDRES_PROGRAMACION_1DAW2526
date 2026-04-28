package Marcos;

public class Corredor extends Participante {

	private double distancia;
	
	public Corredor(String nombre, int edad, double tiempo, double distancia) {
		super(nombre, edad, tiempo);
		this.distancia = distancia;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Distancia: "+this.distancia);
	}
	@Override
	public double calcularPuntuacion() {
		double puntuacion = (distancia / getTiempo())*100;
		return puntuacion = Math.round(puntuacion*100.0)/100.0;
	}

}
