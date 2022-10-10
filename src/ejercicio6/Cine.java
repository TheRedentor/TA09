package ejercicio6;

import java.util.Random;

public class Cine {
	
	private String pelicula;
	private float precio;
	private String[][] sala = new String[8][8]; 
	
	public Cine(String pelicula, float precio) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
	}
	
	public void sentarEspectadores(Espectador[] espectadores, Pelicula pelicula) {	
		for (int i = 0; i < espectadores.length; i++) {
			if(espectadores[i].getDinero()>=precio && espectadores[i].getEdad()>=pelicula.getEdadMinima()) {
				boolean estaOcupado = true;
				do {
					int[] ubicacion = getAsientoAleatorio();
					if(sala[ubicacion[0]][ubicacion[1]] == "") {
						sala[ubicacion[0]][ubicacion[1]] = espectadores[i].getNombre();
						estaOcupado = false;
					}
				} while (estaOcupado == true);
			}
		}	
	}
	
	public int[] getAsientoAleatorio() {
		int[] filaColumna = new int[2];
		Random ran = new Random();
		//devuelve números randoms del 0 al 7
		filaColumna[0] = ran.nextInt(8);
		filaColumna[1] = ran.nextInt(8);
		
		return filaColumna;
	}
	
	
	public String getPelicula() {
		return pelicula;
	}
	
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
