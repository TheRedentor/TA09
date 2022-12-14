package ejercicio5;

import ejercicio5.Aula;
import ejercicio5.Materia;
import ejercicio5.Profesor;

import java.util.ArrayList;

import ejercicio5.Alumno;

public class Metodos {

	// Metodo para inicializar las aulas
	public static Aula[] iniciarAulas() {
		Aula[] aulas = new Aula[3];
		aulas[0] = new Aula(1, 5, Materia.filosofia.toString());
		aulas[1] = new Aula(2, 8, Materia.fisica.toString());
		aulas[2] = new Aula(3, 10, Materia.matematicas.toString());

		return aulas;
	}

	// Metodo para inicializar los profesores
	public static Profesor[] iniciarProfesore() {
		Profesor[] profesores = new Profesor[3];
		profesores[0] = new Profesor("Jose", 35, "hombre", Materia.matematicas.toString());
		profesores[1] = new Profesor("María", 45, "mujer", Materia.filosofia.toString());
		profesores[2] = new Profesor("Pepe", 60, "hombre", Materia.fisica.toString());

		return profesores;
	}

	// Metodo para inicializar los alumnos
	public static Alumno[] iniciarAlumnos() {
		Alumno[] alumnos = new Alumno[10];

		alumnos[0] = new Alumno("Pepe", 13, "hombre", 7);
		alumnos[1] = new Alumno("Maria", 12, "mujer", 3);
		alumnos[2] = new Alumno("Luis", 12, "hombre", 4);
		alumnos[3] = new Alumno("Oscar", 15, "hombre", 6);
		alumnos[4] = new Alumno("Ana", 14, "mujer", 7);
		alumnos[5] = new Alumno("Jaume", 13, "hombre", 8);
		alumnos[6] = new Alumno("Juan", 12, "hombre", 8);
		alumnos[7] = new Alumno("Joel", 14, "hombre", 8);
		alumnos[8] = new Alumno("Rosa", 15, "mujer", 7);
		alumnos[9] = new Alumno("Marta", 13, "mujer", 8);

		return alumnos;
	}

	// Este método determinará si habrá clases o no
	public static void imprimirHayClases(Aula aulas[], Profesor profes[], Alumno alumnos[]) {
		// simulación de si hay clases o no
		for (int i = 0; i < profes.length; i++) {
			for (int j = 0; j < aulas.length; j++) {
				if (profes[i].getMateria().equals(aulas[j].getMateria())) {
					if (aulas[j].hayClases(alumnos, profes[i])) {
						mostrarAula(aulas, profes, alumnos, j);
					} else {
						System.out.println("No hay clases de " + profes[i].getMateria() + " en el aula " + (j+1));
					}
				}
			}
		}
	}
	
	// Este método  imprimirá los alumnos y alumnas por separado
	public static void imprimirAlumnosPorGenero (Alumno alumnos[]) {
		ArrayList<Alumno> hombres = new ArrayList<>();
		ArrayList<Alumno> mujeres = new ArrayList<>();
		
		for(int i = 0; i<alumnos.length; i++) {
			if(alumnos[i].getSexo() == "hombre") {
				hombres.add(alumnos[i]);
			} else {
				mujeres.add(alumnos[i]);
			}
		}
		
		System.out.println("\n---------Estudiantes hombres----------");
		hombres.forEach((alumno)->{
			if(comprobarAprobado(alumno)) {
				System.out.println(alumno.toString());
			}
			
		});
		System.out.println("\n---------Estudiantes mujeres----------");
		mujeres.forEach((alumna)->{
			if(comprobarAprobado(alumna)) {
			System.out.println(alumna.toString());
			}
		});
	}
	
	// Este método mostrará las aulas que si realizaran clase
	public static void mostrarAula(Aula aulas[], Profesor profes[], Alumno alumnos[], int j) {
		System.out.println("Aula Nº "+ (j+1));
		System.out.println("\nMateria: "+aulas[j].getMateria());
		
		for (int i = 0; i < profes.length; i++) {
			if(aulas[j].getMateria().equals(profes[i].getMateria())) {
				System.out.println("Profesor: "+profes[i].getNombre());
			}
		}
		
		System.out.println("Alumnos: \n");
		
		for (int i = 0; i < aulas[j].getNumMaxEstudiantes(); i++) {
			System.out.println(alumnos[i].toString());
		}
		System.out.println("-----------------------------");
	}
	
	public static boolean comprobarAprobado(Alumno alumno) {
		boolean b = true;
		
		if(alumno.getNota()>=5) {
			b = true;
		}else {
			b=false;
		}
		return b;
	}
}
