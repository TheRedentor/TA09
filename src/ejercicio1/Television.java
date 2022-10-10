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
		super(precioBase,color,consumoEnergetico,peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public int precioFinal() {
		int precioFinal = super.precioFinal();
		if(resolucion>40) {
			int plus = (precioFinal*30)/100;
			precioFinal += plus;
		} else if(sintonizadorTDT) {
			precioFinal+=50;
		}
		return precioFinal;
	}
	
}