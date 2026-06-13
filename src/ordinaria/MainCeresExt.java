package ordinaria;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema Agroalimentario "CeresExt".
 * Implementa un CRUD completo de productos.
 */
public class MainCeresExt {

    public static void main(String[] args) {
        ArrayList<ProductoExtremadura> inventario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nSISTEMA AGROALIMENTARIO \"CeresExt\"");
            System.out.println("============================");
            System.out.println("1. Alta de Producto");
            System.out.println("2. Listado General");
            System.out.println("3. Búsqueda Detallada");
            System.out.println("4. Actualización de Precio");
            System.out.println("5. Baja de Producto");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        altaProducto(sc, inventario);
                        break;
                    case 2:
                        listadoGeneral(inventario);
                        break;
                    case 3:
                        busquedaDetallada(sc, inventario);
                        break;
                    case 4:
                        actualizarPrecio(sc, inventario);
                        break;
                    case 5:
                        bajaProducto(sc, inventario);
                        break;
                    case 6:
                        System.out.println("Guardando datos... Saliendo del sistema CeresExt. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("[ERROR] Opción no válida. Debe ser entre 1 y 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("=========");
                System.out.println("[ERROR] Entrada no válida. Por favor, introduce un número.");
                System.out.println("===========");
            }

        } while (opcion != 6);

        sc.close();
    }

    /**
     * Da de alta un nuevo producto (Ibérico o Vegetal).
     */
    private static void altaProducto(Scanner sc, ArrayList<ProductoExtremadura> inventario) {
        System.out.println("\nNUEVO PRODUCTO");
        System.out.println("============");
        System.out.print("¿Qué tipo de producto deseas registrar? (1: Ibérico, 2: Vegetal): ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Denominación: ");
        String denominacion = sc.nextLine();

        System.out.print("Precio por kilo (€): ");
        double precioKilo = Double.parseDouble(sc.nextLine());

        double[] producciones = new double[4];
        for (int i = 0; i < producciones.length; i++) {
            System.out.print("Introduce la producción del trimestre " + (i + 1) + " (toneladas): ");
            producciones[i] = Double.parseDouble(sc.nextLine());
        }

        if (tipo == 1) {
            System.out.print("Pureza de raza (50, 75, 100): ");
            int pureza = Integer.parseInt(sc.nextLine());
            ProductoIberico p = new ProductoIberico(denominacion, precioKilo, producciones, pureza);
            inventario.add(p);
            System.out.println("> Producto Ibérico registrado con éxito. Código asignado: " + p.getCodigo());
        } else if (tipo == 2) {
            System.out.print("¿Es cultivo ecológico? (true/false): ");
            boolean ecologico = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Número de hectáreas: ");
            double hectareas = Double.parseDouble(sc.nextLine());
            ProductoVegetal p = new ProductoVegetal(denominacion, precioKilo, producciones, ecologico, hectareas);
            inventario.add(p);
            System.out.println("> Producto Vegetal registrado con éxito. Código asignado: " + p.getCodigo());
        } else {
            System.out.println("[ERROR] Tipo de producto no válido.");
        }
    }

    /**
     * Muestra el listado completo de productos aplicando polimorfismo y comprobación de tipos.
     */
    private static void listadoGeneral(ArrayList<ProductoExtremadura> inventario) {
        System.out.println("\nLISTADO GENERAL DE PRODUCTOS");
        for (ProductoExtremadura p : inventario) {
            System.out.println(p.toString());
            System.out.println("-> Producción Anual Total: " + p.getTotalToneladas() + " toneladas.");
            System.out.println("-> " + p.getMejorTrimestre() + ".");
            System.out.printf("-> Subvención asignada: %.2f € (Polimorfismo)\n", p.calcularSubvencion());

            if (p instanceof ProductoIberico) {
                ProductoIberico iberico = (ProductoIberico) p;
                System.out.println("-> Certificación: " + iberico.obtenerColorEtiqueta() + " (Uso de instanceof)");
            }
        }
    }

    /**
     * Busca un producto por su código y muestra su detalle.
     */
    private static void busquedaDetallada(Scanner sc, ArrayList<ProductoExtremadura> inventario) {
        System.out.println("\nBÚSQUEDA DETALLADA ---");
        System.out.print("Introduce el código a buscar: ");
        String codigoBuscado = sc.nextLine();

        boolean encontrado = false;
        for (ProductoExtremadura p : inventario) {
            if (p.getCodigo().equalsIgnoreCase(codigoBuscado)) {
                System.out.println(" > Producto localizado:");
                System.out.println("Denominación: " + p.getDenominacion());
                
                if (p instanceof ProductoVegetal) {
                    ProductoVegetal pv = (ProductoVegetal) p;
                    System.out.println("Tipo: Vegetal (Ecológico: " + (pv.isEsEcologico() ? "Sí" : "No") + ")");
                    System.out.println("Hectáreas: " + pv.getHectareas());
                } else if (p instanceof ProductoIberico) {
                    ProductoIberico pi = (ProductoIberico) p;
                    System.out.println("Tipo: Ibérico (Pureza: " + pi.getPurezaRaza() + "%)");
                }
                
                System.out.println("Precio/kg: " + p.getPrecioKilo() + " €");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no localizado.");
        }
    }

    /**
     * Actualiza el precio de un producto localizado por su código.
     */
    private static void actualizarPrecio(Scanner sc, ArrayList<ProductoExtremadura> inventario) {
        System.out.println("\n--- ACTUALIZACIÓN DE PRECIO");
        System.out.print("Introduce el código del producto: ");
        String codigoBuscado = sc.nextLine();

        for (ProductoExtremadura p : inventario) {
            if (p.getCodigo().equalsIgnoreCase(codigoBuscado)) {
                System.out.print("Introduce el nuevo precio: ");
                double nuevoPrecio = Double.parseDouble(sc.nextLine());
                p.setPrecioKilo(nuevoPrecio);
                System.out.println("> Precio actualizado correctamente mediante Setter.");
                return;
            }
        }
        System.out.println("Producto no localizado.");
    }

    /**
     * Elimina un producto del ArrayList a través de su código.
     */
    private static void bajaProducto(Scanner sc, ArrayList<ProductoExtremadura> inventario) {
        System.out.println("\nBAJA DE PRODUCTO --");
        System.out.print("Introduce el código a eliminar: ");
        String codigoBuscado = sc.nextLine();

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getCodigo().equalsIgnoreCase(codigoBuscado)) {
                inventario.remove(i);
                System.out.println("> Producto " + codigoBuscado + " eliminado del sistema correctamente.");
                return;
            }
        }
        System.out.println("Producto no localizado.");
    }
}

/**
 * Clase abstracta que representa a un producto base de Extremadura.
 */


/**
 * Representa un producto ibérico que hereda de ProductoExtremadura.
 */
class ProductoIberico extends ProductoExtremadura {
    private int purezaRaza;

    public ProductoIberico(String denominacion, double precioKilo, double[] producciones, int purezaRaza) {
        super(denominacion, precioKilo, producciones);
        this.purezaRaza = purezaRaza;
    }

    @Override
    public double calcularSubvencion() {
        if (purezaRaza == 100) {
            return 2000 + (getPrecioKilo() * 0.05);
        } else {
            return 1000;
        }
    }

    /**
     * Devuelve el color de la etiqueta según la pureza.
     */
    public String obtenerColorEtiqueta() {
        if (purezaRaza == 100) return "Etiqueta Negra";
        if (purezaRaza == 75) return "Etiqueta Roja";
        if (purezaRaza == 50) return "Etiqueta Verde";
        return "Sin certificar";
    }

    public int getPurezaRaza() { return purezaRaza; }
}

