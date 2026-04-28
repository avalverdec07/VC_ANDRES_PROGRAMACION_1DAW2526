package Marcos;

public class Ciclista extends Participante {
	
	private String tipoBicicleta;

	public Ciclista(String nombre, int edad, double tiempo, String tipoBicicleta) {
		super(nombre, edad, tiempo);
		this.tipoBicicleta = tipoBicicleta;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Tipo de bicicleta: "+this.tipoBicicleta);
	}
	@Override
	public double calcularPuntuacion () {
		double puntuacion = (1000.0 / getTiempo());
		if (tipoBicicleta.equals("carretera")) {
			puntuacion *=1.2;
		}
		else if (tipoBicicleta.equals("montaña")) {
			puntuacion *= 1.1;
		}
		return puntuacion = Math.round(puntuacion *100)/100;
	}

}
