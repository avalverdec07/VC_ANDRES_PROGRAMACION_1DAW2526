package Recuperacion;

import java.util.Arrays;

public class RegistroTemperatura extends RegistroMeteo{
	
	private double temperaturas[] = new double[3];

	public RegistroTemperatura(String municipio, double[] temperaturas) {
		super(municipio);
		this.temperaturas = temperaturas;
	}

	@Override
	public String evaluarAlerta() {

		for(int i=0; i<temperaturas.length; i++) {
			if(temperaturas[i]>40) {
				 return "ALERTA ROJA: ola de calor.";
			} else if (temperaturas[i]<0) {
				 return "ALERTA AZUL: heladas.";
			} else {
				
			}
		}
		return "Temperaturas estables";
	}
	
	public double calcularVolatilidad() {
		
		double minimo, maximo;
		// Inicializo el máximo y el mínimo a la primera posición del array
		maximo=minimo=temperaturas[0];
		
		/* A partir de la segunda posición voy comparando el máximo y el mínimo.
		*/
		for(int i=1; i<temperaturas.length; i++) {
			maximo=Math.max(maximo, temperaturas[i]);
			minimo=Math.min(minimo, temperaturas[i]);
		}
		
		// Devuelvo la raiz cuadrada de la amplitud térmica.
		return Math.sqrt(maximo-minimo);
		
	}

	@Override
	public String toString() {
		return super.toString() + "Temperaturas: "+Arrays.toString(temperaturas);
	}
	
	
	
}
