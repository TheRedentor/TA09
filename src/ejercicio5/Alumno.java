package ejercicio5;

import java.util.Random;

public class Alumno extends Persona {
	// Atributos
	int nota;
	final int NOTA_DEF = 0;

	// Constructor por defecto
	public Alumno() {
		super();
		this.asistio = asistenciaAula();
	}
	
	// Constructor con la nota como atributo
	public Alumno(int nota) {
		super();
		this.asistio = asistenciaAula();
		this.nota = verificarNota(nota);
	}

	// Constructor con todos los atributos
	public Alumno(String nombre, int edad, String sexo, int nota) {
		super(nombre, edad, sexo);
		this.asistio = asistenciaAula();
		this.nota = verificarNota(nota);
	}
	
	// Método para comprobar que nota esta entre los parámetros correctos
	public int verificarNota(int nota) {
		if(nota>=0 && nota<=10) {
			return nota;
		} else {
			return NOTA_DEF;
		}
	}

	// toString para mostrar todos los atributos de la clase
	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", asistio=" + asistio + "]";
	}

	// Método para generar la asistencia del alumno
	@Override
	public boolean asistenciaAula() {
		Random r = new Random();
		int random = r.nextInt(100);
		
		if(random>50) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
