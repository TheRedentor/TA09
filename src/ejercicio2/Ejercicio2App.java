package ejercicio2;

public class Ejercicio2App {

	public static void main(String[] args) {

		Serie[] series = iniciarSeries();
		Videojuego[] videojuegos = iniciarVideojuegos();
		
		series[1].entregar();
		series[4].entregar();
		
		videojuegos[2].entregar();
		videojuegos[3].entregar();
		
		devolucion(series, videojuegos);
		
		compararDuracion(series, videojuegos);
		
	}

	public static Serie[] iniciarSeries() {
		Serie[] series = new Serie[5];

		series[0] = new Serie();
		series[1] = new Serie("Samurai Jack", "Genndy Tartakovsky");
		series[2] = new Serie("Arcane", "Riot Games");
		series[3] = new Serie("Breaking Bad", "Vince Gillighan", Generos.DRAMA.toString(), 6);
		series[4] = new Serie("Brooklyn Nine-Nine", "Dan Goor", Generos.COMEDIA.toString(), 8);

		return series;
	}

	public static Videojuego[] iniciarVideojuegos() {
		Videojuego[] videojuegos = new Videojuego[5];
		
		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("God of War", 20);
		videojuegos[2] = new Videojuego("Death Stranding", 40);
		videojuegos[3] = new Videojuego("Hollow Knight", "Metroidvania", "Team Cherry", 20);
		videojuegos[4] = new Videojuego("Hades", "Rogue Lite", "Supergiant Games", 24);
		
		return videojuegos;
	}

	public static void devolucion(Serie[] series, Videojuego[] videojuegos) {
		int contS = 0;
		int contV = 0;
		for (int i = 0; i < series.length; i++) {
			if(series[i].isEntregado()) {
				series[i].imprimirDatos();
				contS++;
				series[i].devolver();
			}
		}
		
		System.out.println("\nSe han entregado "+contS+" series.\n");
		
		for (int i = 0; i < videojuegos.length; i++) {
			if(videojuegos[i].isEntregado()) {
				System.out.println(videojuegos[i].toString());
				contV++;
				videojuegos[i].devolver();
			}
		}
		
		System.out.println("Se han entregado "+contV+" videojuegos.");
		
	}

	public static void compararDuracion(Serie[] series, Videojuego[] videojuegos) {
		
		Serie s = new Serie();
		Videojuego v = new Videojuego();
		
		for (int i = 0; i < series.length; i++) {
			s = series[i].compareTo(series[i]);
		}
		
		System.out.println("\nEsta es la serie con más temporadas:");
		s.imprimirDatos();
		
		for (int i = 0; i < videojuegos.length; i++) {
			v = videojuegos[i].compareTo(videojuegos[i]);
		}
		
		System.out.println("\nEste es el videojuego con más horas estimadas: ");
		System.out.println(v.toString());
	}
}
