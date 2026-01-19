package UT04.FichaEjercicios.ListaUniversitaria;

import java.util.Scanner;

public class EmpleadoUniversitario extends Persona {
	protected int numSegSocial;
	protected double salario;
	protected String departamento;
	
	public void setNumSegSocial() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de la seguridad social: ");
		this.numSegSocial = teclado.nextInt();
		teclado.close();	
	}
	
	public void setSalario() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el salario: ");
		this.salario = teclado.nextDouble();
		teclado.close();	
	}
	
	public void setDepartamento() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el departamento: ");
		this.departamento = teclado.nextLine();
		teclado.close();	
	}

	@Override
	public String toString() {
		return "EmpleadoUniversitario [numSegSocial=" + numSegSocial + ", salario=" + salario + ", departamento="
				+ departamento + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", codigoPostal=" + codigoPostal + ", telefono=" + telefono + "]";
	}
	
	
	
}
