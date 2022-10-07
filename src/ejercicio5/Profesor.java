package ejercicio5;

import java.util.Random;

public class Profesor extends Persona {
	String materia;
	
	public Profesor() {
		super();
		this.materia = "";
	}

	public Profesor(String materia) {
		super();
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + "]";
	}

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
	
}
