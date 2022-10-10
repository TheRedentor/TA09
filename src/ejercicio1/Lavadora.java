package ejercicio1;

public class Lavadora extends Electrodomestico {
	private double carga;
	private final double CARGA_DEF = 5.0;
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga =CARGA_DEF;
	}
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, double carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}
}
