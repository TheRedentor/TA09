package ejercicio5;

import java.util.ArrayList;

public class Aula {
	// Atributos
	private int idNum;
	private int numMaxEstudiantes;
	private String materia;
	
	
	// Constructor por defecto
	public Aula() {
		super();
		this.idNum=0;
		this.numMaxEstudiantes=0;
		this.materia = "";
	}

	// Constructor con todos los atributos
	public Aula(int idNum, int numMaxEstudiantes, String materia) {
		super();
		this.idNum = idNum;
		this.numMaxEstudiantes = numMaxEstudiantes;
		this.materia = materia;
	}

	//Método para comprobar si hay clase
	public boolean hayClases(Alumno[] alumnos, Profesor profesor) {

		//Si el profesor asistiÃ³ y es el profesor de la misma materia del aula entonces me fijo la asistencia de los alumnos, est
		if(profesor.asistio && profesor.materia == this.materia) {
			int totalAlumnos = this.numMaxEstudiantes;
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
	
	// toString para mostrar los atributos de la clase
	@Override
	public String toString() {
		return "Aula [idNum=" + idNum + ", numMaxEstudiantes=" + numMaxEstudiantes + ", materia=" + materia + "]";
	}
	
	// Getters
	public String getMateria() {
		return materia;
	}


	public int getIdNum() {
		return idNum;
	}


	public int getNumMaxEstudiantes() {
		return numMaxEstudiantes;
	}
	
	
	
}
