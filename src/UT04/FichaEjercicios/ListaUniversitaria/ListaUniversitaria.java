package UT04.FichaEjercicios.ListaUniversitaria;
import java.util.Scanner;
public class ListaUniversitaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadoUniversitario e1, e2, e3, e4;
		int contadorEmpleados=0;
		
		Facultad docente1, docente2, docente3;
		int contadorDocentes=0;
		
		Estudiante estudiante1, estudiante2, estudiante3, estudiante4, estudiante5,
		estudiante6, estudiante7;
		int contadorEstudiantes=0;
		
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("¿Qué quieres dar de alta: Empleado(1), Docente(2), Estudiante(3), Salir(4)");
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				if(contadorEmpleados>4) {
					System.out.println("Error: no se pueden crear más de 4 empleados");
				} else {
					switch(contadorEmpleados) {
					case 0: 
						System.out.println("Pasamos a crear el primer Empleado: ");
						
					}
				}
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		
		
		
	}while(opcion!=4);

}
}
