package UT02.Prueba_Evaluacion;

public class Descuento {
	public static double calcularPrecioConDescuento(double precio, double porcentaje) {
		return Math.round(precio - (precio*porcentaje/100));
	}
}
