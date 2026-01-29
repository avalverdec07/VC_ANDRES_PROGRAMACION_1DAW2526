package UT05.Arrays;

public class InversorNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String alumnos[] = {"Andres", "David", "Luis", "Antonio", "Marcos"};
		String alumnos[] = new String[5];
		alumnos[0]="Andres";
		alumnos[1]="David";
		alumnos[2]="Antonio";
		alumnos[3]="Marcos";
		alumnos[4]="Luis";
		
		for (int i=0; i<alumnos.length;i++) {
			System.out.println("Nombre del alumno nº"+i+": "+alumnos[i]);
		}
		System.out.println("--- AHORA IMPRIMOS EL ARRAY A LA INVERSA ---");
		for (int i=alumnos.length-1; i>0; i--) {
			System.out.println("Nombre del alumno nº"+i+": "+alumnos[i]);
		}
	}
}
