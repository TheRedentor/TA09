package ejercicio1;

public class Television extends Electrodomestico{
	
	private double resolucion;
	private boolean sintonizadorTDT;
	private final double RESOLUCION_DEF = 20;
	private final boolean SINTONIZADOR_TDT_DEF = false;
	
	public Television() {
		super();
		this.resolucion =RESOLUCION_DEF;
		this.sintonizadorTDT =SINTONIZADOR_TDT_DEF;
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion =RESOLUCION_DEF;
		this.sintonizadorTDT =SINTONIZADOR_TDT_DEF;
	}
	
	public Television(int precioBase, String color, char consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
}
