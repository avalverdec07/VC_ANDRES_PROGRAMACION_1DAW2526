package UT04.FichaEjercicios.VelasGata;

public class Vela {
	private String color;
	//Se almacena la altura en metros.
	protected double altura;
	protected double precio;
	
	//Getters
	public String getColor() {
		return color;
	}
	public double getAltura() {
		return altura;
	}
	public double getPrecio() {
		return precio;
	}
	// Setters
	public void setColor(String color) {
		this.color = color;
	}
	public void setAltura(double altura) {
		this.altura = altura;
		this.precio = (altura*100)*2; // Multiplicamos la altura por 100 para pasarla a cm
		//Ej: 1.22m altura -> 1.22*100=122cm
	}
	
}
