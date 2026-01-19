package UT04.FichaEjercicios.VelasGata;

public class VelaPerfumada extends Vela {
	private String aroma;

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}
	
	@Override
	public void setAltura(double altura) {
		this.altura=altura;
		this.precio=(altura*100)*3;
	}
	
	
}
