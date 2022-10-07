package ejercicio5;

import java.util.ArrayList;

public class Aula {
	// Atributos
	private int idNum;
	private int numMaxEstudiantes;
	private String materia;
	
	// Constructores
	
	public Aula() {
		super();
		this.idNum=0;
		this.numMaxEstudiantes=0;
		this.materia = "";
	}

	
	public Aula(int idNum, int numMaxEstudiantes, String materia) {
		super();
		this.idNum = idNum;
		this.numMaxEstudiantes = numMaxEstudiantes;
		this.materia = materia;
	}


	public boolean hayClases(ArrayList<Alumno> alumnos, Profesor profesor) {

		//Si el profesor asistió y es el profesor de la misma materia del aula entonces me fijo la asistencia de los alumnos y, si es mayor a 50%, retorno true
		if(profesor.asistio && profesor.materia == this.materia) {
			int totalAlumnos = alumnos.size();
			int alumnosPresentes = 0;
			for(Alumno al : alumnos) {
				if(al.asistio)
					alumnosPresentes++;
			}
			int porcentajePresentes = alumnosPresentes*100/totalAlumnos;
			if(porcentajePresentes>=50) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Aula [idNum=" + idNum + ", numMaxEstudiantes=" + numMaxEstudiantes + ", materia=" + materia + "]";
	}
	
}
