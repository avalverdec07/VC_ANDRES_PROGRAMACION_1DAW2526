package UT05.Enumerados;

public class Ej1_Semaforo {

	public enum tipoSemaforo  {
		ROJO,
		AMARILLO,
		VERDE
	}
	
	public static void main(String[] args) {

		
		tipoSemaforo semaforo = tipoSemaforo.AMARILLO;
		
		switch(semaforo) {
		
		case ROJO: System.out.println("SEMÁFORO EN ROJO: NO PUEDES PASAR.");
		break;
		
		case AMARILLO: System.out.println("SEMÁFORO EN AMARILLO: PASAR CON PRECAUCIÓN.");
		break;
		
		case VERDE: System.out.println("SEMÁFORO EN VERDE: PUEDES PASAR.");
		break;
		
		}
		
	}

}
