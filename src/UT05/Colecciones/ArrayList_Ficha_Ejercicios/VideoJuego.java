package UT05.Colecciones.ArrayList_Ficha_Ejercicios;

public class VideoJuego implements Comparable {

		private String titulo;
		private Double horasJuego;
		private String desarrollador;
		
		public VideoJuego(String titulo, Double horasJuego, String desarrollador) {
			this.titulo = titulo;
			this.horasJuego = horasJuego;
			this.desarrollador = desarrollador;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public Double getHorasJuego() {
			return horasJuego;
		}

		public void setHorasJuego(Double horasJuego) {
			this.horasJuego = horasJuego;
		}

		public String getDesarrollador() {
			return desarrollador;
		}

		public void setDesarrolador(String desarrolador) {
			this.desarrollador = desarrollador;
		}

		@Override
		public String toString() {
			return "VideoJuego [titulo=" + titulo + ", horasJuego=" + horasJuego + ", desarrollador=" + desarrollador
					+ "]";
		}

		@Override
		public int compareTo(Object o) {
			VideoJuego j = (VideoJuego)o;
			if(this.horasJuego>j.getHorasJuego()) {
				return -1;
			} else {
				return 1;
			}
			//return this.titulo.compareTo(j.getTitulo());
		}

	
		
		
		
	

	
		
		
		
		
		
	
}
