package ejercicio5;

import java.util.Arrays;

public class Ejercicio5App {

	public static void main(String[] args) {
		Aula[] aulas = Metodos.iniciarAulas();
        Profesor[] profes = Metodos.iniciarProfesore();
        Alumno[] alumnos = Metodos.iniciarAlumnos();

        System.out.println(Arrays.toString(aulas));
        System.out.println(Arrays.toString(alumnos));
        System.out.println(Arrays.toString(profes));
        //simulación de si hay clases o no
		for(int i=0;i<profes.length;i++) {
			for(int j=0; j<aulas.length; j++) {
				if(profes[i].getMateria().equals(aulas[j].getMateria())) {
					if(aulas[j].hayClases(alumnos, profes[i])) {
						System.out.println("Hay clases de " + profes[i].getMateria() + " en aula N°"+(j+1));
					} else {
						System.out.println("No hay clases de " + profes[i].getMateria());
					}
				}
			}
		}
		
	}
	
	

}
