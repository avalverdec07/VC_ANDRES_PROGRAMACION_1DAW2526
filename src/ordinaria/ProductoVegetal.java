package ordinaria;

/**
 * Representa un producto vegetal que hereda de ProductoExtremadura.
 */
public class ProductoVegetal extends ProductoExtremadura {
    private boolean esEcologico;
    private double hectareas;

    public ProductoVegetal(String denominacion, double precioKilo, double[] producciones, boolean esEcologico, double hectareas) {
        super(denominacion, precioKilo, producciones);
        this.esEcologico = esEcologico;
        this.hectareas = hectareas;
    }

    @Override
    public double calcularSubvencion() {
        double total = 150 * hectareas;
        if (esEcologico) {
            total *= 1.5;
        }
        return total;
    }

    public boolean isEsEcologico() { 
    	return esEcologico; 
    	}
    public double getHectareas() { 
    	return hectareas; 
    	}
}
