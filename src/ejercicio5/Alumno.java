package ejercicio5;

import java.util.Random;

public class Alumno extends Persona {
	int nota;

	public Alumno() {
		super();
		this.asistio = asistenciaAula();
	}

	public Alumno(int nota) {
		super();
		this.asistio = asistenciaAula();
		this.nota = nota;
	}

	public Alumno(String nombre, int edad, String sexo, int nota) {
		super(nombre, edad, sexo);
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", asistio="
				+ asistio + "]";
	}

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
