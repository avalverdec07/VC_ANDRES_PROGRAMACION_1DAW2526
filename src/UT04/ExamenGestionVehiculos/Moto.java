package UT04.ExamenGestionVehiculos;
/*
 * @ author Andrés Valverde
 */
public class Moto extends Vehiculo {
	private int cilindrada;
	private String tipo;
	
	public Moto(String marca, int velocidadMaxima, int cilindrada, String tipo) {
		super(marca, velocidadMaxima);
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Cilindrada: "+this.cilindrada);
		if (this.tipo.equalsIgnoreCase("Deportiva")) {
			System.out.println("Tipo de moto: Deportiva.");
		} else {
			System.out.println("Tipo de moto: Scooter");
		}
	}

	
	public void arrancar(boolean caballete) {
		// TODO Auto-generated method stub
		super.arrancar();
		if (caballete==true) {
			System.out.println("No se puede arrancar la moto con el caballete puesto.");
		} else {
			System.out.println("La moto ha arrancado correctamente.");
		}
	}
}

