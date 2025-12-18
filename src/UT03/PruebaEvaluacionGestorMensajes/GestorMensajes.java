package UT03.PruebaEvaluacionGestorMensajes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorMensajes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String autor, contenido;
		
		/* ----- MENSAJE 1 ----- */
		System.out.println("MENSAJE 1");
		do {
			System.out.println("Introduce el autor del mensaje: ");
			autor=teclado.nextLine();
			if (autor.equals("")) {
				System.out.println("El autor no puede estar vacío. Por favor,"
						+ "introduzca de nuevo el autor.");
			}
		}while(autor.equals(""));
		
		do { 
			System.out.println("Introduce el contenido del mensaje: ");
			contenido=teclado.nextLine();
			if (contenido.length()<5||contenido.length()>200) {
				System.out.println("El contenido debe tener entre 5 y 200 caracteres."
						+ "Por favor, introduzca de nuevo el contenido.");
			}
		}while(contenido.length()<5||contenido.length()>200);
		
		Mensaje m1 = new Mensaje(autor, contenido);
		System.out.println("Mensaje registrado correctamente.");
		System.out.println("Longitud sin espacios: "+m1.getLongitud());
		System.out.println("Palabras: "+m1.getPalabras());
		
		/* ----- MENSAJE 2 ----- */
		System.out.println("MENSAJE 2");
		do {
			System.out.println("Introduce el autor del mensaje: ");
			autor=teclado.nextLine();
			if (autor.equals("")) {
				System.out.println("El autor no puede estar vacío. Por favor,"
						+ "introduzca de nuevo el autor.");
			}
		}while(autor.equals(""));
		
		do { 
			System.out.println("Introduce el contenido del mensaje: ");
			contenido=teclado.nextLine();
			if (contenido.length()<5||contenido.length()>200) {
				System.out.println("El contenido debe tener entre 5 y 200 caracteres."
						+ "Por favor, introduzca de nuevo el contenido.");
			}
		}while(contenido.length()<5||contenido.length()>200);
		
		Mensaje m2 = new Mensaje(autor, contenido);
		System.out.println("Mensaje registrado correctamente.");
		System.out.println("Longitud sin espacios: "+m2.getLongitud());
		System.out.println("Palabras: "+m2.getPalabras());
		
		/* ----- MENSAJE 3 ----- */
		System.out.println("MENSAJE 3");
		do {
			System.out.println("Introduce el autor del mensaje: ");
			autor=teclado.nextLine();
			if (autor.equals("")) {
				System.out.println("El autor no puede estar vacío. Por favor,"
						+ "introduzca de nuevo el autor.");
			}
		}while(autor.equals(""));
		
		do { 
			System.out.println("Introduce el contenido del mensaje: ");
			contenido=teclado.nextLine();
			if (contenido.length()<5||contenido.length()>200) {
				System.out.println("El contenido debe tener entre 5 y 200 caracteres."
						+ "Por favor, introduzca de nuevo el contenido.");
			}
		}while(contenido.length()<5||contenido.length()>200);
		
		Mensaje m3 = new Mensaje(autor, contenido);
		System.out.println("Mensaje registrado correctamente.");
		System.out.println("Longitud sin espacios: "+m3.getLongitud());
		System.out.println("Palabras: "+m3.getPalabras());
		
		/* ----- MENÚ DE OPCIONES ----- */
		int opcion=0;
		do {
			System.out.println("MENÚ DE OPCIONES:");
			System.out.println("1. Mostrar los mensajes registrados.");
			System.out.println("2. Mostrar el mensaje más largo.");
			System.out.println("3. Contar cuántas veces aparece una letra en un mensaje.");
			System.out.println("4. Crear una versión invertida del contenido.");
			System.out.println("5. Convertir un mensaje a \"Formateado Título\".");
			System.out.println("6. Salir.");
			System.out.println("Elige una opción: ");
			try {
				opcion=teclado.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("No has introducido un valor válido. "
						+ "Por favor, inténtelo de nuevo");
			}
				
			teclado.nextLine(); // Limpiamos el buffer.
			
			switch(opcion) {
				case 1:
					System.out.println("Has elegido la opción 1.");
					System.out.println("---- MENSAJE 1 ----");
					m1.mostrar();
					System.out.println("---- MENSAJE 2 ----");
					m2.mostrar();
					System.out.println("---- MENSAJE 3 ----");
					m3.mostrar();
					break;
				case 2:
					System.out.println("Has elegido la opción 2.");
					if (m1.getLongitud()>m2.getLongitud()&&m1.getLongitud()>m3.getLongitud()) {
						System.out.println("El mensaje más largo es el de "+m1.getAutor());
						m1.mostrar();
					} else if (m2.getLongitud()>m1.getLongitud()&&m2.getLongitud()>m3.getLongitud()) {
						System.out.println("El mensaje más largo es el de "+m2.getAutor());
						m2.mostrar();
					} else {
						System.out.println("El mensaje más largo es el de "+m3.getAutor());
						m3.mostrar();
					}
					break;
				case 3:
					System.out.println("Has elegido la opción 3.");
					System.out.println("Selecciona el número del mensaje (1-3): ");
					int numero = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Introduce la letra a buscar: ");
					String letra = teclado.nextLine();
					char buscarLetra = letra.charAt(0);
					int contador=0;
					switch(numero) {
					case 1:
						for(int i=0; i<m1.getContenido().length();i++) {
							if(m1.getContenido().charAt(i)==' ') {
								continue;
							}
							if(buscarLetra==m1.getContenido().charAt(i)){
								contador++;
							}
						}
						break;
					case 2:
						for(int i=0; i<m2.getContenido().length();i++) {
							if(m2.getContenido().charAt(i)==' ') {
								continue;
							}
							if(buscarLetra==m2.getContenido().charAt(i)){
								contador++;
							}
						}
						break;
					case 3:
						for(int i=0; i<m3.getContenido().length();i++) {
							if(m3.getContenido().charAt(i)==' ') {
								continue;
							}
							if(buscarLetra==m3.getContenido().charAt(i)){
								contador++;
							}
						}
						break;
					}
					System.out.println("La letra "+buscarLetra+" aparece "+contador+
							" veces en este mensaje.");
					break;
				case 4:
					System.out.println("Has elegido la opción 4.");
					System.out.println("Elige el mensaje a invertir (1-3): ");
					numero = teclado.nextInt();
					teclado.nextLine();
					String invertida="";
					switch(numero) {
					case 1:
						System.out.println("El contenido original es: "+m1.getContenido());
						for(int i=m1.getContenido().length()-1; i>=0; i--) {
							invertida=invertida+m1.getContenido().charAt(i);
						}
						break;
					case 2:
						System.out.println("El contenido original es: "+m2.getContenido());
						for(int i=m2.getContenido().length()-1; i>=0; i--) {
							invertida=invertida+m2.getContenido().charAt(i);
						}
						break;
					case 3:
						System.out.println("El contenido original es: "+m3.getContenido());
						for(int i=m3.getContenido().length()-1; i>=0; i--) {
							invertida=invertida+m3.getContenido().charAt(i);
						}
						break;
					}
					System.out.println("Cadena invertida: "+invertida);
					break;
				case 5:
					System.out.println("Has elegido la opción 5.");
					System.out.println("Selecciona el mensaje (1-3): ");
					numero = teclado.nextInt();
					String titulo="";
					teclado.nextLine();
					switch(numero) {
					case 1:
						System.out.println("El contenido original es: "+m1.getContenido());
						titulo=titulo+Character.toUpperCase(m1.getContenido().charAt(0));
						for(int i=1; i<m1.getContenido().length(); i++) {
							if (m1.getContenido().charAt(i)==' ') {
								titulo=titulo+' '+Character.toUpperCase(m1.getContenido().charAt(i+1));
								i++;
							} else {
								titulo=titulo+m1.getContenido();
							}
						}
						break;
					case 2:
						System.out.println("El contenido original es: "+m2.getContenido());
						titulo=titulo+Character.toUpperCase(m2.getContenido().charAt(0));
						for(int i=1; i<m2.getContenido().length(); i++) {
							if (m1.getContenido().charAt(i)==' ') {
								titulo=titulo+' '+Character.toUpperCase(m2.getContenido().charAt(i+1));
								i++;
							} else {
								titulo=titulo+m2.getContenido();
							}
						}
						break;
					case 3:
						System.out.println("El contenido original es: "+m3.getContenido());
						titulo=titulo+Character.toUpperCase(m3.getContenido().charAt(0));
						for(int i=1; i<m3.getContenido().length(); i++) {
							if (m3.getContenido().charAt(i)==' ') {
								titulo=titulo+' '+Character.toUpperCase(m3.getContenido().charAt(i+1));
								i++;
							} else {
								titulo=titulo+m3.getContenido();
							}
						}
						break;
					}
					break;
				case 6:
					System.out.println("Has elegido salir. ¡Hasta luego!");
					break;
			}
		}while(opcion!=6);
		
		
	}

}
