package CuentaBancaria;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta() {
		this.titular="Sin Titular";
		this.cantidad=0;		
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}
	
	
	
	public String getTitular() {
		return titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			this.cantidad=this.cantidad+cantidad;
		}
	}
		
	public void retirar(double cantidad){
		this.cantidad=this.cantidad-cantidad;
	}

	@Override
	public String toString() {
		return "Titular:" + titular + "\nCantidad actual:" + cantidad;
	}
	
}
