package ejercicio2;

public class Videojuego implements Entregable{
	// Declaración de Variables
	private String titulo, genero, company;
	private int horasEstimadas;
	private boolean entregado;
	private final int HORAS_ESTIMADAS_DEF = 10;
	private final boolean ENTREGADO_DEF = false;
	
	// Constructores
	public Videojuego() {
		this.titulo ="";
		this.genero ="";
		this.company ="";
		this.horasEstimadas = HORAS_ESTIMADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero="";
		this.company="";
		this.entregado =ENTREGADO_DEF;
	}
	
	public Videojuego(String titulo, String genero, String company, int horasEstimadas) {
		this.titulo=titulo;
		this.genero = genero;
		this.company = company;
		this.horasEstimadas = horasEstimadas;
		this.entregado=ENTREGADO_DEF;
	}
	
	// Compara las horas estimadas de los videojuegos
	public Videojuego compareTo(Videojuego videojuego1) {
		if(horasEstimadas>videojuego1.getHorasEstimadas()) {
			return new Videojuego(titulo, genero, company, horasEstimadas);
		} else {
			return videojuego1;
		}
	}
	
	public void entregar() {
		entregado = true;
	}
	
	public void devolver() {
		entregado = false;
	}
	
	public boolean isEntregado() {
		return entregado;
	}
	
	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", company=" + company + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + "]";
	}
	
	
	
}
