package ejercicio2;

public class Serie implements Entregable {
	// Declaración de Variables
	private String titulo, creador, genero;
	private int nTemporadas;
	private boolean entregado;

	private final int N_TEMPORADAS_DEF = 3;
	private final boolean ENTREGADO_DEF = false;
	
	// Constructores
	public Serie() {
		this.titulo = "";
		this.creador = "";
		this.genero = "";
		this.nTemporadas = N_TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.nTemporadas = N_TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}

	public Serie(String titulo, String creador, String genero, int nTemporadas) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = checkGenero(genero);
		this.nTemporadas = nTemporadas;
	}
	
	// Imprime los datos de la serie
	public void imprimirDatos() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Creador: " + creador);
		System.out.println("G�nero: " + genero);
		System.out.println("N� temporadas: " + nTemporadas);
		if(entregado) {
			System.out.println("Entregada: s�");
		} else {
			System.out.println("Entregada: no");
		}
		
	}
	
	// Comprueba que el género sea válido
	public String checkGenero(String genero) {
		boolean esValido = false;
		for(Generos gen : Generos.values()) {
			if(genero.toLowerCase().equals(gen.toString().toLowerCase())) {
				esValido=true;
			}
		}
		return esValido ? genero : "";
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
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCreador() {
		return creador;
	}

	public String getGenero() {
		return genero;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}
	
	// Compara las temporadas de las series
	public Serie compareTo(Serie s) {
		if (nTemporadas>s.getnTemporadas()) {
			return new Serie(titulo, creador, genero, nTemporadas);
		} else {
			return s;
		}
	}

}
