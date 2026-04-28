package Recuperacion;

public class RegistroLLuvia extends RegistroMeteo {

	private double litrosMetroCuadrado;

	public RegistroLLuvia(String municipio, double litrosMetroCuadrado) {
		super(municipio);
		this.litrosMetroCuadrado = litrosMetroCuadrado;
	}

	@Override
	public String evaluarAlerta() {
		// TODO Auto-generated method stub
		if (litrosMetroCuadrado>80.5) {
			return "ALERTA NARANJA: Riesgo de inundación.";
		} else {
			return "Precipitaciones normales.";
		}
	}
	
	
	
}
