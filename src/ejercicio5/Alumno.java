package ejercicio5;

import java.util.Hashtable;
import java.util.Random;

public class Alumno extends Persona {
	Hashtable<String, Integer> notas;

	public Alumno() {
		super();
		this.asistio = asistenciaAula();
	}

	public Alumno(Hashtable<String, Integer> notas) {
		super();
		this.asistio = asistenciaAula();
		this.notas = notas;
	}

	public Alumno(String nombre, int edad, String sexo, Hashtable<String, Integer> notas) {
		super(nombre, edad, sexo);
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [notas: \nFilosofía= " + notas.get("filosofia") + "\nMatemáticas= " + notas.get("matematicas") +  "\nFísica= " + notas.get("fisica") + "\nAsistencia: "+asistio;
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
