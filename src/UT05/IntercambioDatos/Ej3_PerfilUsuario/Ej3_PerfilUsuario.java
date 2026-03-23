package UT05.IntercambioDatos.Ej3_PerfilUsuario;

import com.google.gson.Gson;


public class Ej3_PerfilUsuario {

	public static void main(String[] args) {
		/**
		 * DESERIALIZAR JSON
		 */

		
		String jsonEntrada = "{\"nombre\":\"Luisa\",\"edad\":30,\"email\":\"luisa@mail.com\"}";
		
		Gson gson = new Gson();

		Usuario usuario = gson.fromJson(jsonEntrada, Usuario.class);
		
		System.out.println("El email del usuario es: "+usuario.getEmail());
		
		/**
		 * Serializar JSON
		 */
		
		Usuario andres = new Usuario("Andrés", 18, "micorreo@correo.es");
		
		String cadena = gson.toJson(andres);
		
		System.out.println("El objeto usuario serializado a una cadena JSon es:");
		System.out.println(cadena);
	}
}
