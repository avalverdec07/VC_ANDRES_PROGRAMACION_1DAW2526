
public class AplicacionPrincipal {

	public static void main(String[] args) {
	
		Coche pepe = new Coche("Renault", "Rojo", 5, 150.0);

		Coche andres = new Coche("Peugeot", "Azul", 3, 110.0);
		
		pepe.arrancar();
		
		andres.arrancar();
		
		Moto juan = new Moto("Kawasaki", "negra", "cadena");
		
		juan.arrancar();
		juan.acelerar();
		
		juan.mostrarInformacion();
		
		
		
		
		
	}

}
