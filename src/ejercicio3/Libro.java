package ejercicio3;

public class Libro {
	// Declaraci�n de Variables
	private String ISBN;
	private String titulo;
	private String autor;
	private int numPag;
	
	// Constructor por defecto
	public Libro() {
		super();
	}

	// Constructor con todos los atributos
	public Libro(String iSBN, String titulo, String autor, int numPag) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	// Getters y Setters
	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getNumPag() {
		return numPag;
	}


	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}


	//toString para mostrar todos los atributos de la clase
	@Override
	public String toString() {
		return "El libro "+this.titulo+" con ISBN "+this.ISBN+" creado por el autor "+this.autor+" tiene "+this.numPag+" p�ginas.\n";
	}
	
	// Este m�todo compara el n�mero de p�ginas de dos Libros y dice cual tiene m�s
	public String compararLibros(Libro libro1, Libro libro2) {
		if(libro1.getNumPag() > libro2.getNumPag()) {
			return libro1.getTitulo()+" tiene m�s p�ginas que "+libro2.getTitulo();
		}else if(libro1.getNumPag() < libro2.getNumPag()) {
			return libro2.getTitulo()+" tiene m�s p�ginas que "+libro1.getTitulo();
		}else {
			return libro1.getTitulo()+" y "+libro2.getTitulo()+" tienen el mismo n�mero de p�ginas.";
		}
	}
	
}
