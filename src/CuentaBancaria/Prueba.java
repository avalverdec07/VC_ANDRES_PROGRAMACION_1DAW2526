package CuentaBancaria;

public class Prueba {

	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta("Luis", 250.0);
		
		miCuenta.ingresar(100);
		miCuenta.retirar(80);
		
		System.out.println(miCuenta.toString());

	}

}
