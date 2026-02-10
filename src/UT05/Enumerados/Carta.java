package UT05.Enumerados;



public class Carta {

	public enum Palo {
		CORAZONES,
		DIAMANTES,
		TREBOLES,
		PICAS
	}

		int numero;
		Palo palo;
		
		public Carta(int n, Palo p) {
			this.numero=n;
			this.palo=p;
		}
		
			
	
		@Override
		public String toString() {
			return "Carta [numero=" + numero + ", palo=" + palo + "]";
		}



		public void mostrarCarta() {
			
			switch(numero) {
			
				case 11: System.out.println("La carta es la J de "+palo+".");
				break;
				case 12: System.out.println("La carta es la Reina de "+palo+".");
				break;
				case 13: System.out.println("La carta es el Rey de "+palo+".");
				break;
				default: System.out.println("La carta es el "+numero+" de "+palo+".");
			
			}
		}


	public static void main(String[] args) {
		// int ale = (int)(Math.random() * (max - min + 1)) + min;

		Palo palos[] = Palo.values();
		int numero=(int)(Math.random()*(13-1+1))+1;
		
		int indice=(int)(Math.random()*(palos.length-1-1+1))+1;

		Palo paloAleatorio=palos[indice];
		
		Carta jugada= new Carta(numero, paloAleatorio);
		
		jugada.mostrarCarta();
	}

}
