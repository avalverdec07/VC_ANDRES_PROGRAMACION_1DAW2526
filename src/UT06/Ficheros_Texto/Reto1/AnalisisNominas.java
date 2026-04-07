package UT06.Ficheros_Texto.Reto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AnalisisNominas {

	public static void main(String[] args) {
		File directorio = new File(".");
        System.out.println("El directorio actual es: "+ directorio.getAbsolutePath());
        
        
        try (
             BufferedReader br = new BufferedReader(new FileReader("./src/UT06/Ficheros_Texto/Reto1/empleados.csv"))) {
        	 String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
