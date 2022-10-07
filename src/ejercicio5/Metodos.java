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
	    Profesor profesorFilosofia = new Profesor("María", 45, "mujer", Materia.filosofia.toString());
	    Profesor profesorFisica = new Profesor("Pepe", 60, "hombre", Materia.fisica.toString());
	}
}
