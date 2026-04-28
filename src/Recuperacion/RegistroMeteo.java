package Recuperacion;

public class RegistroMeteo {

	private String codigoRegistro, municipio;

	public RegistroMeteo(String municipio) {
		this.codigoRegistro = generarCodigo();
		this.municipio = municipio;
	}
	
	private String generarCodigo() {
		
		String codigo;
		
		codigo=municipio.substring(0, 3);
		codigo=codigo.toUpperCase();
		
		if(codigo.length()==1) {
			codigo=codigo+"XX";
		} else if (codigo.length()==2){
			codigo=codigo+"X";
		}
		
		/* Otra forma de añadir X hasta que la longitud sea de 3.
		while(codigo.length()<3) {
			codigo=codigo+"X";
		}
		*/
		
		
		codigo=codigo+"-";
		codigo=codigo+(int)Math.random()*(9999-1000)+1000;
		
		return codigo;
	}
	
	public String evaluarAlerta() {
		return "Evaluación genérica: Sin incidencias.";
		
		
		
		
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@Override
	public String toString() {
		return "RegistroMeteo [codigoRegistro=" + codigoRegistro + ", municipio=" + municipio + "]";
	}
	
	
	
}
