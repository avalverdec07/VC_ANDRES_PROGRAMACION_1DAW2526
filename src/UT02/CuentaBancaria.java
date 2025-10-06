package UT02;

import java.util.Scanner;

public class CuentaBancaria {
	/*
	 * Crea una clase CuentaBancaria con atributos titular y saldo.
	 * Implementa los métodos ingresar(double) y retirar(double).
	 * Prueba a ingresar y retirar dinero desde el main.
	 */
	String titular;
	double saldo;
	
	// Constructor
	public void CuentaBancaria() {
		titular="";
		saldo=0;
	}
	
	public void setTitular(String nombre) {
		titular = nombre;
	}
	
	
	// Sumamos "dinero" al saldo
	public void ingresar(double dinero) {
		saldo = saldo + dinero;
		//saldo += dinero
	}
	
	// Restamos "dinero" al saldo
	public void retirar(double dinero) {
		saldo = saldo - dinero;
		//saldo -= dinero
	}
	
	public void mostrarSaldo() {
		System.out.println("El saldo actual de la cuenta es: "+saldo);
	}
	
	public void mostrarTitular() {
		System.out.println("El titular de la cuenta es: "+titular);
	}
	
	
	// ***********   MÉTODO MAIN *********************************************
	
	public static void main(String[] args) {
	
	//Declaro un objeto de clase CuentaBancaria
	//Estoy declarando el objeto "cuentaDeAndres" de la clase CuentaBancaria
	CuentaBancaria cuentaDeAndres = new CuentaBancaria(); // El new llama al constructor
	Scanner teclado = new Scanner(System.in);
	
	// Pregunto al usuario su nombre para poner el titular de la cuenta.
	System.out.println("Bienvenido al Banco Central. Creando cuenta....");
	System.out.println("Por favor, introduzca su nombre: ");
	
	String nombre = teclado.nextLine();
	cuentaDeAndres.setTitular(nombre);
	
	
	// Pedir al usuario, ingresar dinero y mostrar
	System.out.println("Introduce la cantidad de dinero a ingresar: ");
	double dinero = teclado.nextDouble();
	cuentaDeAndres.ingresar(dinero);
	cuentaDeAndres.mostrarSaldo();
	
	// Pedir al usuario, retirar dinero y mostrar
	System.out.println("Introduce la cantidad de dinero a retirar: ");
	double retirar = teclado.nextDouble();
	cuentaDeAndres.retirar(retirar);
	cuentaDeAndres.mostrarSaldo();
	
	cuentaDeAndres.mostrarTitular();
	}
}
