package ejercicio5;

public abstract class Persona {
	//Atributos
	protected String nombre, sexo;
	protected int edad;
	protected boolean asistio;
	
	//Constructor por defecto
	public Persona() {
		this.nombre="";
		this.edad = 0;
		this.sexo ="";
	}
	
	//Constructor con los atributos
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	//Método Abstracto para los descendientes
	public abstract boolean asistenciaAula();
	
	//Getters
	public String getSexo() {
		return sexo;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
