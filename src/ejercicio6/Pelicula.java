package ejercicio6;

public class Pelicula {
	
	private String titulo, director;
	private int duracion, edadMinima;
	
	public Pelicula(String titulo, String director, int duracion, int edadMinima) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getEdadMinima() {
		return edadMinima;
	}
	
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
}
