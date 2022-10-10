package ejercicio2;

public class Ejercicio2App {

	public static void main(String[] args) {

		Serie[] series = iniciarSeries();
		Videojuego[] videojuegos = iniciarVideojuegos();

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

}
