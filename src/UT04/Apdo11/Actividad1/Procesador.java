package UT04.Apdo11.Actividad1;

public class Procesador {
	double velocidad;
	int nucleos;
	
	public Procesador(double v, int n) {
		this.velocidad=v;
		this.nucleos=n;
	}
	
	public void mostrarInfo() {
		System.out.println("PROCESADOR: \n Velocidad= "+velocidad+"Ghz "+" Nucleos= "+nucleos);
	}
	
	
}
