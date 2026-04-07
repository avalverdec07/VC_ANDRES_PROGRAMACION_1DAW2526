package UT06.Ficheros_Texto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
public class ChatLog {

	public static void main(String[] args) {
		String frase;
		Scanner entrada = new Scanner(System.in);
        // 1. try-with-resources: ¡Se cerrarán solos!
       // 2. new FileWriter("registro.txt", true) -> El 'true' activa "añadir al final"
       try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/UT06/Ficheros_Texto/registro.txt", true));
            PrintWriter out = new PrintWriter(bw)) { // PrintWriter nos da el cómodo println()
           
    	   	while(true) {
	    	   	System.out.println("Introduce una frase para guardar en el fichero: ");
	    	   	frase=entrada.nextLine();
	    	   	if(frase.equalsIgnoreCase("FIN")) {
	    	   		break;
	    	   	} else {
	    	   		out.println(frase);
	    	   	}
	           	
    	   	}
           	
		    System.out.println("¡Datos guardados en el log!");

      } catch (IOException e) {
	       System.out.println("Error al escribir: " + e.getMessage());
      	}
	    }


}
