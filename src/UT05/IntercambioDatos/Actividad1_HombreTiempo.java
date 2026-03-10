package UT05.IntercambioDatos;

import java.util.List;

import com.google.gson.Gson;

public class Actividad1_HombreTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String informacion = "{\"ciudad\": \"Mérida\",\"temperatura\": 22.5,\"alertas\": [\"Viento\", \"Polen\"]}";
		
	Gson deserializador = new Gson();

	Prevision miPrevision = deserializador.fromJson(informacion, Prevision.class);
	
	System.out.println("¡Cuidado en "+miPrevision.getCiudad()+"!");
	System.out.print("Hay alerta de: ");
	
	List<String> alertas = miPrevision.getAlertas();
	
	for(String alerta : alertas) {
		System.out.print(alerta);
		System.out.print(",");
	}
	
	
	
	}

}
