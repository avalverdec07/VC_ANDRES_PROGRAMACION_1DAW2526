package UT02;

public class Coche {
	//Atributos
	String marca;
	int año;
	
	public Coche() {
		marca="Sin marca";
		año=2000;
	}
	
	public Coche(String m, int a) {
		marca = m;
		año = a;
	}
	
	public Coche(String m) {
		marca = m;
		año = 2000;
	}
	
	public void mostrarCoche() {
		System.out.println("La marca de este coche es: "+marca+", matriculado en el año "+año);
	}
	
	
	
}
