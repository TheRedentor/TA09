package ejercicio1;

public class Television {
	
	private double resolucion;
	private boolean sintonizadorTDT;
	private final double RESOLUCION_DEF = 20;
	private final boolean SINTONIZADOR_TDT_DEF = false;
	
	public Television() {
		super();
		this.resolucion =RESOLUCION_DEF;
		this.sintonizadorTDT =SINTONIZADOR_TDT_DEF;
	}

	public Television(int precio, int peso) {
		super(precio, peso);
		this.resolucion =RESOLUCION_DEF;
		this.sintonizadorTDT =SINTONIZADOR_TDT_DEF;
	}
	
}
