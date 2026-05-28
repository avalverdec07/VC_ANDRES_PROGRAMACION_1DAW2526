package Recuperacion;

public class RegistroMeteo {

	private String codigoRegistro;
	private String municipio;
	
	
	public RegistroMeteo(String municipio) {
		this.municipio = municipio;
		this.codigoRegistro = generarCodigo();
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

	private String generarCodigo() {
		String codigo="";
		codigo=municipio.substring(0, 3);
		codigo=codigo.toUpperCase();
		while (codigo.length() < 3) {
			codigo += "X";
		}
		codigo=codigo+'-';
		codigo+=(int)Math.random()*(9999-1000+1)+1000;
		return codigo;
	}

	@Override
	public String toString() {
				
		return "Registro: " + this.codigoRegistro + " | Municipio: " + this.municipio+" ";
		
	}
	
	
	
	
	
	
	
	
	
	
}
