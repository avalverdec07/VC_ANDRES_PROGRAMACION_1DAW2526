package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5_BibliotecaSteam {

		public static void main (String args[]) {
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
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce un título para buscar: ");
			String titulo = entrada.nextLine();
			
			boolean encontrado=false;
			int i=0;
			while(!encontrado && i<biblioteca.size()) {
				if (biblioteca.get(i).getTitulo().equalsIgnoreCase(titulo)) {
					encontrado=true;
					System.out.println("Titulo encontrado:");
					System.out.println(biblioteca.get(i).toString());
				}
				i++;
			}
			if (encontrado==false) {
				System.out.println("No tienes el título en tu biblioteca.");
			}
			
			/* Busca todos los juegos de la plataforma "Xbox" y 
			 * súmales 10 horas extra a sus horasJugadas.
			 */
			
			for(VideoJuego v : biblioteca) {
				if(v.getDesarrollador().equalsIgnoreCase("XBOX")) {
					v.setHorasJuego(v.getHorasJuego()+10);
					System.out.println("Se ha incrementado en 10 las horas del siguiente juego: ");
					System.out.println(v.toString());
				}
			}
			
			/*
			 * Crea una nueva lista llamada juegosPasados. 
			 * Recorre la original y copia en esta nueva lista solo 
			 * aquellos juegos que tengan más de 100 horas.
			 */
			List<VideoJuego> juegosPasados = new ArrayList<>();
			
			for(VideoJuego j : biblioteca) {
				if(j.getHorasJuego()>100) {
					juegosPasados.add(j);
				}				
			}
			
			System.out.println("Los juegos con más de 100h son:");
			for(VideoJuego j : juegosPasados) {
				System.out.println(j.toString());	
			}
			
			entrada.close();
		}
}

