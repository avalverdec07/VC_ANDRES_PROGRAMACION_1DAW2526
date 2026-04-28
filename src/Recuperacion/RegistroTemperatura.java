package Recuperacion;

public class RegistroTemperatura extends RegistroMeteo {

	private double []temperaturas = new double[3];

	public RegistroTemperatura(String municipio, double[] temperaturas) {
		super(municipio);
		this.temperaturas = temperaturas;
	}

	
	private double Volatilidad() {
		
		double max, min;
		//Inicializamos max y min al primer valor del array.
		max = min = temperaturas[0];
		
		for (int i=1; i<temperaturas.length; i++) {
			max=Math.max(max, temperaturas[i]);
			min=Math.min(min, temperaturas[i]);
		}
		
		double amplitud = max-min;
		
		return Math.sqrt(amplitud);
		
		
	}
	
	@Override
	public String evaluarAlerta() {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<temperaturas.length; i++) {
			if (temperaturas[i]>40) {
				return "ALERTA ROJA: Ola de la calor.";
			} else if (temperaturas[i]<0){
				return "ALERTA AZUL: Heladas.";
			} 
		}
		return "Temperaturas estables.";
		}	
	
}
