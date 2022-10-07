package ejercicio5;

public abstract class Persona {
	protected String nombre, sexo;
	protected int edad, asistencia;
	
	
	public Persona() {
		this.nombre="";
		this.edad = 0;
		this.sexo ="";
		this.asistencia=0;
	}
	
	public Persona(String nombre, int edad, String sexo, int asistencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;
	}                                 
	                                      
}
