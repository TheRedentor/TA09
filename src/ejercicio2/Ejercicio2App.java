package ejercicio2;

public class Ejercicio2App {

	public static void main(String[] args) {
		
		Serie serie = new Serie("Peaky Blinders", "Steven Knight", "drama", 6, true);
		Serie serie2 = new Serie();
		//serie3 posee el género incorrecto
		Serie serie3 = new Serie("Breaking bad", "Vince Gilligan", "dramatico", 5, true);
		
		System.out.println("--------Serie 1-----------");
		serie.imprimirDatos();
		System.out.println("--------Serie 2-----------");
		serie2.imprimirDatos();
		System.out.println("--------Serie 3-----------");
		serie3.imprimirDatos();

	}

}
