package UT05.Colecciones;

import java.util.HashSet;
import java.util.Set;

/*
 * Queremos generar una combinación de la Lotería Primitiva
 * (6 números entre 1 y 49).
 * Genera números aleatorios y mételos en el set hasta que el tamaño 
 * (size()) sea 6.
 */
public class Ej2_BomboLoteria {

	public static void main(String[] args) {

		Set<Integer> bomboLoteria = new HashSet<>();
		int ale=0;
		while (bomboLoteria.size()<6) {
			ale = (int)(Math.random() * (49))+1;
			bomboLoteria.add(ale);
		}
		
		System.out.println("La combinación ganadora de la Primitiva es la siguiente: ");
		
		//System.out.println(bomboLoteria);
		
		for (Integer numero : bomboLoteria) {
			System.out.println(numero);
		}
		
		

		
	}

}
