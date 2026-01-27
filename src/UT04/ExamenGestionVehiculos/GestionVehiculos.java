package UT04.ExamenGestionVehiculos;
/*
 * @ author Andrés Valverde
 */
public class GestionVehiculos {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo("Peugeot", 160);
		Vehiculo v2 = new Vehiculo("Renault");
		Coche miCoche = new Coche("Citroen", 170, 5, false);
		Moto miMoto = new Moto("Honda", 220, 750, "Deportiva");
		
		
		v1.setMarca("Opel");
		System.out.println("Se modifica la marca de v1: "+v1.getMarca());
		
		v2.setVelocidadMaxima(150);
		System.out.println("Se modifica la velocidad máxima de v2: "+v2.getVelocidadMaxima());

		miCoche.setNumeroPuertas(3);
		System.out.println("Se modifica el numero de puertas de miCoche: "+miCoche.getNumeroPuertas());

		miMoto.setVelocidadMaxima(250);
		System.out.println("Se modifica la velocidad máxima de miMoto: "+miMoto.getVelocidadMaxima());

		v1.mostrarDatos();
		v2.mostrarDatos();
		miCoche.mostrarDatos();
		miMoto.mostrarDatos();
		
		v1.arrancar();
		miCoche.arrancar("llave");
		miMoto.arrancar(true);
		miMoto.arrancar(false);
		
		Vehiculo masRapido = Vehiculo.vehiculoMasRapido(miCoche, miMoto);
		System.out.println("El más rápido es: ");
		masRapido.mostrarDatos();
		
	}

}
