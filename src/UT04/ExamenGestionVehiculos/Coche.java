package UT04.ExamenGestionVehiculos;
/*
 * @ author Andrés Valverde
 */
public class Coche extends Vehiculo {

	private int numeroPuertas;
	private boolean automatico;
	
	public Coche(String marca, int velocidadMaxima, int numeroPuertas, boolean automatico) {
		super(marca, velocidadMaxima);
		this.numeroPuertas = numeroPuertas;
		this.automatico = automatico;
	}
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Número de puertas: "+this.numeroPuertas);
		if (this.automatico==true) {
			System.out.println("Tipo: automático.");
		} else {
			System.out.println("Tipo: manual.");
		}
	}
	
	public void arrancar(String modo) {
		super.arrancar();
		if (modo.equalsIgnoreCase("llave")) {
			System.out.println("Arrancando el coche con llave.");
		} else {
			System.out.println("Arranco el coche con botón.");
		}
	}
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	
	
}
