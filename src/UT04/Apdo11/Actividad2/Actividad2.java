package UT04.Apdo11.Actividad2;

public class Actividad2 {

	public static void main(String args[] ) {
		
		Habitacion c = new Habitacion("Cocina", 10);
		Habitacion d = new Habitacion("Dormitorio principal", 12);
		Habitacion b = new Habitacion("Aseo", 4);
		Habitacion s = new Habitacion("Salon comedor", 25);
		
		Casa casaDeCampo = new Casa(c, b, s, d);
		
		casaDeCampo.mostrarCasa();
		System.out.println("---");
		casaDeCampo.calcularMetrosTotales();
		
		
	
	}
}
