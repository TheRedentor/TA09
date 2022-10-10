package ejercicio1;

public class Lavadora extends Electrodomestico {
	//atributos
	private double carga;
	private final double CARGA_DEF = 5.0;
	
	//constructor por defecto
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	//constructor
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga =CARGA_DEF;
	}
	
	//constructor
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, double carga) {
		super(precioBase,color,consumoEnergetico,peso);
		this.carga = carga;
	}
	
	public double getCarga() {
		return carga;
	}

	//agregamos funcionalidad al método precioFinal de Electrodoméstico. Si la carga es mayor a 50 cuesta 50€ más
	public int precioFinal() {
		int precio = super.precioFinal();
		
		if(getCarga()>30) {
			precio = precio + 50;
		}
		
		return precio;
	}
}
