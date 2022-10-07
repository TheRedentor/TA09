package ejercicio5;

import java.util.Random;

public class Alumno extends Persona {
	int nota;

	public Alumno() {
		super();
		this.nota = 0;
	}

	public Alumno(int nota) {
		super();
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + "]";
	}

	@Override
	public boolean asistenciaAula() {
		Random r = new Random();
		int random = r.nextInt(100);
		
		if(random>51) {
			return true;
			
		}else {
			return false;
		}
		
		
	}
	
	
	
	
	
}
