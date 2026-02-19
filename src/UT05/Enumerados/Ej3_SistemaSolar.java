package UT05.Enumerados;

import java.util.ArrayList;

public class Ej3_SistemaSolar {

	public enum Planeta{
		MERCURIO(3.303e+23, 2.4397e6),
		VENUS(4.869e+24, 6.0518e6),
		TIERRA(5.976e+24, 6.37814e6),
		MARTE(6.421e+23, 3.3972e6),
		JUPITER(1.9+27, 7.1492e7),
		SATURNO(5.686e+26,6.0268e7),
		URANO(8.686e+25,2.5559e7),
		NEPTUNO(1.023e+26,2.4746e7);
		
		// G es la constante gravitacional universal (Thanks, Newton)
		private static final double G = 6.674E-11;
		
		private final double masa;
		private final double radio;
		
		
		private Planeta(double m, double r) {
			this.masa=m;
			this.radio=r;
		}
		
		public double getMasa() {
			return masa;
		}
		
		public double getRadio() {
			return radio;
		}
		
		public double calcularGravedad() {
			return G*masa/(radio*radio);
		}
		
	}
	
	
	public static void main(String[] args) {

		for(Planeta p: Planeta.values()) {
			double g = p.calcularGravedad();
			System.out.printf("La gravedad en %s es: %.2f m/s2%n", p.name(), g);
		}
		
	
		
		
		
		
	}

}
