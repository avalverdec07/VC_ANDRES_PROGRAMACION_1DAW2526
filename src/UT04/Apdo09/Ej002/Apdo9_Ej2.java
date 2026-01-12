package UT04.Apdo09.Ej002;

public class Apdo9_Ej2 {

	public static void main(String[] args) {
		
		
		Coche c = new Coche();
		Bicicleta b = new Bicicleta();
		
		c.abrir();
		c.arrancar();
		c.acelerar(20);
		c.acelerar(20);
		System.out.println("El coche va a "+c.getVelocidad()+"km/h");
		
		b.empujar();
		b.acelerar(5);
		b.acelerar(7);
		System.out.println("La bici va a "+b.getVelocidad()+"km/h");
		
		b.frenar(12);
		
		b.ponerCandado();
		
		
		

	}

}
