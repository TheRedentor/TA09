package ejercicio5;

import ejercicio5.Aula;
import ejercicio5.Materia;

public class Metodos {

	public void iniciarAulas() {
		 Aula aulaFilosofia = new Aula(1, 5, Materia.filosofia.toString());
		 Aula aulaFisica = new Aula(2, 8, Materia.fisica.toString());
		 Aula aulaMatematicas = new Aula(3, 10, Materia.matematicas.toString());
	 }
	
	public void iniciarProfesore() {
		Profesor profesorMatematica = new Profesor("Jose", 35, "hombre", Materia.matematicas.toString());
	    Profesor profesorFilosofia = new Profesor("Mar�a", 45, "mujer", Materia.filosofia.toString());
	    Profesor profesorFisica = new Profesor("Pepe", 60, "hombre", Materia.fisica.toString());
	}
	
	public void iniciarAlumnos() {
		Alumno alumno1 = new Alumno("Pepe", 13, "hombre", 7);
		Alumno alumno2 = new Alumno("Maria", 12, "mujer", 9);
		Alumno alumno3 = new Alumno("Luis", 12, "hombre", 5);
		Alumno alumno4 = new Alumno("Oscar", 15, "hombre", 6);
		Alumno alumno5 = new Alumno("Ana", 14, "mujer", 7);
		Alumno alumno6 = new Alumno("Jaume", 13, "hombre", 8);
		Alumno alumno7 = new Alumno("Juan", 12, "hombre", 8);
		Alumno alumno8 = new Alumno("Joel", 14, "hombre", 8);
		Alumno alumno9 = new Alumno("Rosa", 15, "mujer", 7);
		Alumno alumno10 = new Alumno("Marta", 13, "mujer", 8);
	}
}
