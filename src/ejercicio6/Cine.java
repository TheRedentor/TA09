package ejercicio6;

import java.util.Random;

public class Cine {
	
	//atributos
	private Pelicula pelicula;
	private float precio;
	private String[][] sala = new String[8][8];

	//único constructor
	public Cine(Pelicula pelicula, float precio) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
	}

	// El método sienta a todos los espectadores
	public void sentarEspectadores(Espectador[] espectadores) {
		for (int i = 0; i < espectadores.length; i++) {
			// Si el espectador posee el dinero y la edad requeridas, entonces le asignamos
			// un asiento aleatorio y, si está ocupado le asignamos otro hasta que encuentre
			// uno vacío
			if (espectadores[i].getDinero() >= precio && espectadores[i].getEdad() >= pelicula.getEdadMinima()) {
				boolean estaOcupado = true;
				do {
					int[] ubicacion = getAsientoAleatorio();
					if (sala[ubicacion[0]][ubicacion[1]] == null) {
						sala[ubicacion[0]][ubicacion[1]] = espectadores[i].getNombre();
						estaOcupado = false;
					}
				} while (estaOcupado == true);
			}
		}
	}

	// El método imprime la sala con el número de fila y la letra de columna,
	// imprime vacío al lado si no hay nadie y el nombre del espectador si está
	// ocupado
	public void mostrarSala() {
		String cadena = "ABCDEFGH";

		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				if (sala[i][j] != null) {
					System.out.print(i + 1 + "" + cadena.charAt(j) + " " + sala[i][j].toString() + " ");
				} else {
					System.out.print(i + 1 + "" + cadena.charAt(j) + " vacio ");
				}

			}
			System.out.println("");
		}
	}

	// El método devuelve un asiento aleatorio, siendo la posición 0 la fila y la 1
	// la columna
	public int[] getAsientoAleatorio() {
		int[] filaColumna = new int[2];
		Random ran = new Random();
		// devuelve números randoms del 0 al 7
		filaColumna[0] = ran.nextInt(8);
		filaColumna[1] = ran.nextInt(8);

		return filaColumna;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
