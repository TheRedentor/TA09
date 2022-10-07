package ejercicio5;

import ejercicio5.Aula;
import ejercicio5.Materia;
import ejercicio5.Profesor;
import ejercicio5.Alumno;

public class Metodos {

	public static Aula[] iniciarAulas() {
		Aula[] aulas = new Aula[3];
		aulas[0] = new Aula(1, 5, Materia.filosofia.toString());
		aulas[1] = new Aula(2, 8, Materia.fisica.toString());
		aulas[2] = new Aula(3, 10, Materia.matematicas.toString());

		return aulas;
	}

	public static Profesor[] iniciarProfesore() {
		Profesor[] profesores = new Profesor[3];
		profesores[0] = new Profesor("Jose", 35, "hombre", Materia.matematicas.toString());
		profesores[1] = new Profesor("Mar�a", 45, "mujer", Materia.filosofia.toString());
		profesores[2] = new Profesor("Pepe", 60, "hombre", Materia.fisica.toString());

		return profesores;
	}

	public static Alumno[] iniciarAlumnos() {
		Alumno[] alumnos = new Alumno[10];

		alumnos[0] = new Alumno("Pepe", 13, "hombre", 7);
		alumnos[1] = new Alumno("Maria", 12, "mujer", 9);
		alumnos[2] = new Alumno("Luis", 12, "hombre", 5);
		alumnos[3] = new Alumno("Oscar", 15, "hombre", 6);
		alumnos[4] = new Alumno("Ana", 14, "mujer", 7);
		alumnos[5] = new Alumno("Jaume", 13, "hombre", 8);
		alumnos[6] = new Alumno("Juan", 12, "hombre", 8);
		alumnos[7] = new Alumno("Joel", 14, "hombre", 8);
		alumnos[8] = new Alumno("Rosa", 15, "mujer", 7);
		alumnos[9] = new Alumno("Marta", 13, "mujer", 8);

		return alumnos;
	}

	public static void imprimirHayClases(Aula aulas[], Profesor profes[], Alumno alumnos[]) {
		// simulación de si hay clases o no
		for (int i = 0; i < profes.length; i++) {
			for (int j = 0; j < aulas.length; j++) {
				if (profes[i].getMateria().equals(aulas[j].getMateria())) {
					if (aulas[j].hayClases(alumnos, profes[i])) {
						System.out.println("Hay clases de " + profes[i].getMateria() + " en el aula N°" + (j + 1));
					} else {
						System.out.println("No hay clases de " + profes[i].getMateria());
					}
				}
			}
		}
	}
}
