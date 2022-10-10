package ejercicio5;

import java.util.Random;

public class Profesor extends Persona {
	// Atributos
	String materia;
	
	//Constructor por defecto
	public Profesor() {
		super();
		this.materia = "";
		this.asistio = asistenciaAula();
	}

	//Constructor con todos los atributos
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		this.asistio = asistenciaAula();
	}

	// toString para mostrar todos los atributos
	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", asistio=" + asistio + "]";
	}
	
	//Método para generar la asistencia del profesor
	@Override
	public boolean asistenciaAula() {
		Random r = new Random();
		int random = r.nextInt(100);
		
		if(random>21) {
			return true;
			
		}else {
			return false;
		}
	} 
	
	// Getter
	public String getMateria() {
		return materia;
	}
	
	
	
}
