package ejercicio5;

public abstract class Persona {
	protected String nombre, sexo;
	protected int edad;
	protected boolean asistio;
	
	
	public Persona() {
		this.nombre="";
		this.edad = 0;
		this.sexo ="";
	}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public abstract boolean asistenciaAula();
	
	public String getSexo() {
		return sexo;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
