package ordinaria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

	

public class CeresExt {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<ProductoExtremadura> lista = new ArrayList<>();
	
	public void altaProductoIberico() {
		
	}
	
	
	public void listadoGeneral() {
		
		for(ProductoExtremadura p : lista) {
			System.out.println(p.toString());
		}
		
	}
	
	
	public static void main(String[] args) {

		int opcion = 0;
		
		do {
			
			System.out.println("===============================================");
			System.out.println(" SISTEMA AGROALIMENTARIO 'CeresExt' (v2.0)");
			System.out.println("===============================================");
			System.out.println("1. Alta Producto");
			System.out.println("2. Listado General");
			System.out.println("3. Busqueda Detallada");
			System.out.println("4. Actualizacion de Precio");
			System.out.println("5. Baja de Producto");
			System.out.println("6. Salir");
			
			try {
				opcion=sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Debe elegir un numero entre 1 y 6");
				//return;
			}
			
			sc.nextLine();
			
			switch(opcion) {
			case 1:
                System.out.println("Que producto desea añadir? (1. Producto Iberico / 2. Producto Vegetal)");
                int opcion2 = sc.nextInt();
                sc.nextLine();
                if (opcion2 == 1) {
                   // altaProductoIberico();
                } else if (opcion2 == 2) {
                  //  altaProductoVegetal();
                } else {
                    System.out.println("Opcion no valida. Por favor, elija 1 o 2.");
                }
				break;
			case 2:
				System.out.println("--- LISTADO GENERAL DE PRODUCTOS ---");
				listadoGeneral();
				break;
			case 3:
				System.out.println("--- BUSQUEDA DETALLADA ---");
				//busquedaDetallada();
				break;
			case 4:
				System.out.println("--- ACTUALIZACION DE PRECIO ---");
				//actualizarPrecio();
				break;
			case 5:
				System.out.println("--- BAJA DE PRODUCTO ---");
				//bajaProducto();
				break;
			case 6:
				System.out.println("Guardando datos...Saliendo del sistema CeresExt. ¡Hasta pronto!");
				break;
			default:
				System.out.println("Debes introducir un numero entre 1 y 6");
				break;
				
			}
			
			
		}while(opcion != 6);
		
	}
}

