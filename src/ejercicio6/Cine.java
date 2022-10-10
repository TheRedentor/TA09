package ejercicio6;

public class Cine {
	
	protected String pelicula;
	protected float precio;
	
	public Cine(String pelicula, float precio) {
		super();
		this.pelicula = pelicula;
		this.precio = precio;
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
