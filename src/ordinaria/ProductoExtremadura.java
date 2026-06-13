package ordinaria;

public abstract class ProductoExtremadura {
    private String codigo;
    private String denominacion;
    private double precioKilo;
    private double[] producciones;

    public ProductoExtremadura(String denominacion, double precioKilo, double[] producciones) {
        this.denominacion = denominacion;
        this.precioKilo = precioKilo;
        this.producciones = producciones;
        this.codigo = generarCodigo();
    }

    /**
     * Genera un código único combinando el nombre, números aleatorios y longitud.
     */
    private String generarCodigo() {
        String prefijo = denominacion.toUpperCase();
            while (prefijo.length() < 3) {
                prefijo=prefijo+"Z";
            }

            prefijo = prefijo.substring(0, 3);
        

        int random = (int) (Math.random() * (5000 - 500 + 1)) + 500;
        int longitud = denominacion.length();

        return prefijo + "_" + random + "_" + longitud;
    }

    /**
     * Calcula la suma de toneladas de los 4 trimestres.
     */
    public double getTotalToneladas() {
        double total = 0;
        for (double p : producciones) {
            total += p;
        }
        return total;
    }

    /**
     * Obtiene el trimestre con mayor producción usando Math.max().
     */
    public String getMejorTrimestre() {
        double maximo = producciones[0];
        int trimestreEstrella = 1;

        for (int i = 1; i < producciones.length; i++) {
            if (Math.max(maximo, producciones[i]) == producciones[i]) {
                maximo = producciones[i];
                trimestreEstrella = i + 1;
            }
        }
        return "El trimestre estrella es el " + trimestreEstrella + " con " + maximo + " toneladas";
    }

    public abstract double calcularSubvencion();

    @Override
    public String toString() {
        return "[Código: " + codigo + "] " + denominacion + " - " + precioKilo + " €/kg";
    }

    // --- Getters y Setters encapsulados ---
    public String getCodigo() {
    	return codigo; 
    	}
    public String getDenominacion() {
    	return denominacion; 
    	}
    public double getPrecioKilo() { 
    	return precioKilo; 
    	}
    public void setPrecioKilo(double precioKilo) { 
    	this.precioKilo = precioKilo; 
    	}
    public double[] getProducciones() { 
    	return producciones; 
    	}
}