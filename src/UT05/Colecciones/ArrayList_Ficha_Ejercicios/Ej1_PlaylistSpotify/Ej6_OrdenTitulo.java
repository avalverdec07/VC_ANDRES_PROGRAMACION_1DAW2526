package UT05.Colecciones.ArrayList_Ficha_Ejercicios.Ej1_PlaylistSpotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej6_OrdenTitulo {

	public static void main(String[] args) {
		
		List<VideoJuego> biblioteca = new ArrayList<>();
		
		VideoJuego juego = new VideoJuego("New Zealand Story", 100.50, "Nintendo");
		biblioteca.add(juego);
		juego = new VideoJuego("Wonderboy", 20.20, "Sega");
		biblioteca.add(juego);
		juego = new VideoJuego("Pang", 300.3 ,"Capcom");
		biblioteca.add(juego);
		juego = new VideoJuego("Rick Dangerous", 500.50, "Core Design");
		biblioteca.add(juego);
		juego = new VideoJuego("Medal of Honor",10.00,"XBOX");
		biblioteca.add(juego);
		
		Collections.sort(biblioteca);
		
		for(VideoJuego j : biblioteca) {
			System.out.println(j.toString());
		}
		
	}

}
