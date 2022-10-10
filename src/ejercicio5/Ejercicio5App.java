package ejercicio5;


public class Ejercicio5App {

	public static void main(String[] args) {
		//Inicializamos los objetos
		Aula[] aulas = Metodos.iniciarAulas();
        Profesor[] profes = Metodos.iniciarProfesore();
        Alumno[] alumnos = Metodos.iniciarAlumnos();
        
        //Imprimimos las clases del día
        //Metodos.imprimirHayClases(aulas, profes, alumnos);
        
        //Imprimimos los alumnos dividos por géneros
        Metodos.imprimirAlumnosPorGenero(alumnos);
		
	}
	
	

}
