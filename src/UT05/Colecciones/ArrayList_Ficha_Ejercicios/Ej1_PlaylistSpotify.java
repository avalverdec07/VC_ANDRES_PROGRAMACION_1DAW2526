package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej1_PlaylistSpotify {

	public static void main(String[] args) {

		List<String> playlist = new ArrayList<>();
		
		playlist.add("La vida es un carnaval.");
		playlist.add("Golden");
		playlist.add("Where the streets have no name");
		playlist.add("What's the frequency, Kenneth?");
		playlist.add("Mr. Brightside");
		
		//Recorremos la lista con un bucle for-each
		for(String cancion:playlist) {
			System.out.println("Canción: "+cancion);
		}
		
		playlist.set(2, "Despacito");
		System.out.println("--- SE MODIFICA LA CANCIÓN DE LA POSICIÓN 2 ---");
		
		// Otra forma: recorrer la lista con un iterador
		Iterator<String> it =playlist.iterator();
		
		while(it.hasNext()) {
			System.out.println("Cancion: "+it.next());
			
		}
		
		playlist.remove(0);
		System.out.println("--- SE ELIMINA LA PRIMERA CANCIÓN ---");

		for(String cancion:playlist) {
			System.out.println("Canción: "+cancion);
		}
		System.out.println();
		System.out.printf("Actualmente hay %d canciones en la cola.", playlist.size());
	}

}
