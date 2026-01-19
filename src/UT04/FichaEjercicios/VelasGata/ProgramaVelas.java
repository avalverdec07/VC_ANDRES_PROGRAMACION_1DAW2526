package UT04.FichaEjercicios.VelasGata;

public class ProgramaVelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vela velaNormal = new Vela();
		
		velaNormal.setColor("blanca");
		/* Establezco la altura en 15 centímetros ya que he supuesto que introduzco los datos
		 	en metros. */
		velaNormal.setAltura(0.15);
		
		VelaPerfumada velaFrutasBosque = new VelaPerfumada();
		velaFrutasBosque.setColor("Morado");
		velaFrutasBosque.setAltura(0.25);
		velaFrutasBosque.setAroma("Frutos del Bosque");
		
		System.out.println("--- VELA NORMAL ---");
		System.out.println("Vela de color "+velaNormal.getColor());
		System.out.println("Altura: "+velaNormal.getAltura()+" metros.");
		System.out.println("Su precio es de: "+velaNormal.getPrecio()+"€");
		
		System.out.println("--- VELA PERFUMADA ---");
		System.out.println("Vela de color "+velaFrutasBosque.getColor());
		System.out.println("Altura: "+velaFrutasBosque.getAltura()+" metros.");
		System.out.println("Su precio es de: "+velaFrutasBosque.getPrecio()+"€");
		System.out.println("Esta vela huele a "+velaFrutasBosque.getAroma());
		

		
	}

}
