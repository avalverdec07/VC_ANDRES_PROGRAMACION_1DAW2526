package UT04.Apdo11.Actividad2;

public class Casa {
	private Habitacion cocina;
	private Habitacion salon;
	private Habitacion baño;
	private Habitacion dormitorio;
	
	public Casa(Habitacion cocina, Habitacion salon, Habitacion baño, Habitacion dormitorio) {
		this.cocina = cocina;
		this.salon = salon;
		this.baño = baño;
		this.dormitorio = dormitorio;
	}

	public Habitacion getCocina() {
		return cocina;
	}

	public void setCocina(Habitacion cocina) {
		this.cocina = cocina;
	}

	public Habitacion getSalon() {
		return salon;
	}

	public void setSalon(Habitacion salon) {
		this.salon = salon;
	}

	public Habitacion getBaño() {
		return baño;
	}

	public void setBaño(Habitacion baño) {
		this.baño = baño;
	}

	public Habitacion getDormitorio() {
		return dormitorio;
	}

	public void setDormitorio(Habitacion dormitorio) {
		this.dormitorio = dormitorio;
	}
	
	public void mostrarCasa() {
		System.out.println("------- Te voy a describir mi casa:");
		System.out.println(cocina.toString());
		System.out.println(baño.toString());
		System.out.println(salon.toString());
		System.out.println(dormitorio.toString());
		
		
	}
	
	public void calcularMetrosTotales() {
		double total = cocina.getMetrosCuadrados()+baño.getMetrosCuadrados()+salon.getMetrosCuadrados()+dormitorio.getMetrosCuadrados();
		
		System.out.println("Los metros totales de la casa son: "+total+" metros cuadrados.");
		
	}
	
	
}
