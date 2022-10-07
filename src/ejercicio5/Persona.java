package ejercicio5;

public abstract class Persona {
	protected String nombre, sexo;
	protected int edad, asistencia;
	protected boolean asistio;
	
	
	public Persona() {
		this.nombre="";
		this.edad = 0;
		this.sexo ="";
		this.asistencia=0;
		this.asistio=false;
	}
	
	public Persona(String nombre, int edad, String sexo, int asistencia, boolean asistio) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;
		this.asistio=asistio;
	}
	
}
