package Recuperacion;

public class RegistroLluvia extends RegistroMeteo{

	double litrosMetrosCuadrados;

	public RegistroLluvia(String municipio, double litrosMetrosCuadrados) {
		super(municipio);
		this.litrosMetrosCuadrados = litrosMetrosCuadrados;
	}

	@Override
	public String evaluarAlerta() {
		if (litrosMetrosCuadrados>80.5) {
			return "ALERTA NARANJA: Riesgo de inundación.";
		}
		return "Precipitaciones normales.";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"| Precipitaciones: "+this.litrosMetrosCuadrados+ " L/m2";
	}
	
	
	
	
}
