package UT04.ExamenGestionVehiculos;
/*
 * @ author Andrés Valverde
 */
public class Vehiculo {

	
	private String marca;
	private int velocidadMaxima;
	private boolean enMarcha;
	
	public Vehiculo(String marca, int velocidadMaxima) {
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
		this.enMarcha = false;
	}
	
	public Vehiculo(String marca) {
		this.marca=marca;
		this.velocidadMaxima=120;
		this.enMarcha=false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	public void arrancar() {
		this.enMarcha=true;
		System.out.println("El vehículo ha arrancado.");
	}
	
	public void detener() {
		this.enMarcha=false;
		System.out.println("El vehículo se ha detenido.");
	}
	
	public void mostrarDatos() {
		System.out.println("--- DATOS DEL VEHÍCULO ---");
		System.out.println("Marca: "+this.marca);
		System.out.println("Velocidad máxima: "+this.velocidadMaxima);
		if (this.enMarcha==true) {
			System.out.println("Estado: en marcha.");
		} else {
				System.out.println("Estado: detenido.");
			}
	}
	
	public static Vehiculo vehiculoMasRapido(Vehiculo v1, Vehiculo v2) {
		if (v1.getVelocidadMaxima()>=v2.getVelocidadMaxima()) {
			return v1;
		} else {
			return v2;
		}
	}
	
	
	
}
