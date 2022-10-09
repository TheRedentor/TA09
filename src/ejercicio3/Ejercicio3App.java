package ejercicio3;

public class Ejercicio3App {

	public static void main(String[] args) {
		// Declaración de Variables
		Libro libro1 = new Libro("978-84-666-6232-1", "Arcanum Ilimitado", "Brandon Sanderson", 782);
		Libro libro2 = new Libro("978-84-17347-00-0", "Juramentada", "Brandon Sanderson", 1400);
		
		//Mostrar los dos libros con sus atributos
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Comparar los libros para ver caul tiene más páginas
		System.out.println(libro1.compararLibros(libro1, libro2));
	}

}
