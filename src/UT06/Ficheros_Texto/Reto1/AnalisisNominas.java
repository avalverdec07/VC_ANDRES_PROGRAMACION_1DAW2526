package UT06.Ficheros_Texto.Reto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AnalisisNominas {

	public static void main(String[] args) {
		File directorio = new File(".");
        System.out.println("El directorio actual es: "+ directorio.getAbsolutePath());
        Double gastoTotal=0.0;
   	 	Double salarioMasAlto=0.0;
   	 	String empleadoMejorPagado="Nadie";
        
        try (
             BufferedReader br = new BufferedReader(new FileReader("./src/UT06/Ficheros_Texto/Reto1/empleados.csv"))) {
        	 String linea;
        	 linea = br.readLine();
        	 
        	 while ((linea = br.readLine()) != null) {
                //System.out.println(linea);
                String campos[] = linea.split(",");
                gastoTotal=gastoTotal+Double.parseDouble(campos[3]);
                if (salarioMasAlto<Double.parseDouble(campos[3])) {
                	salarioMasAlto=Double.parseDouble(campos[3]);
                	empleadoMejorPagado=campos[1];
                }
        	 } 
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
            }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/UT06/Ficheros_Texto/Reto1/informe_rrhh.txt", true));
        	            PrintWriter out = new PrintWriter(bw)) {
            	 out.println("El gasto total en salarios es de: "+gastoTotal+" €");
            	 out.println("El empleado con mayor Salario es: "+empleadoMejorPagado+" con "+salarioMasAlto+" €");
         } catch (IOException e) {
      	       System.out.println("Error al escribir: " + e.getMessage());
           	}
        }
}
