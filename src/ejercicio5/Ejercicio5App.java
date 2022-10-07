package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5App {

	public static void main(String[] args) {
		Aula[] aulas = Metodos.iniciarAulas();
        Profesor[] profes = Metodos.iniciarProfesore();
        Alumno[] alumnos = Metodos.iniciarAlumnos();

        System.out.println(Arrays.toString(aulas));
        System.out.println(Arrays.toString(alumnos));
        System.out.println(Arrays.toString(profes));
		
		
	}
	
	

}
