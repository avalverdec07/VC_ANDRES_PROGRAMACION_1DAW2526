package UT04.Apdo09.Ej003;

public class Alumno extends Persona {
	private String curso;

	public Alumno(String n, int e, String curso) {
		super(n, e);
		this.curso = curso;
	}
	
	public Alumno(String curso) {
		super("Sin nombre", 0);
		this.curso=curso;
	}

	@Override
	public void presentarse() {
		// TODO Auto-generated method stub
		super.presentarse();
		System.out.println(" Estoy en "+curso);
		}
}
