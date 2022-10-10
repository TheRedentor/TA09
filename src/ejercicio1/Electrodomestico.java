package ejercicio1;

public abstract class Electrodomestico {
	
	public int precioBase;
	public String color;
	public char consumoEnergetico;
	public int peso;
	static final int PRECIO_BASE = 100;
	static final String COLOR = "Blanco";
	static final char CONSUMO_ENERGETICO = 'F';
	static final int PESO = 5;
	
	public Electrodomestico() {
		
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
		
	}
	
	public Electrodomestico(int precioBase, int peso) {
		
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
		
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		
	}
	
	public int getPrecioBase() {
		return precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public static String comprobarColor(String color) {
		
		if (color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")) {
			
			return color;
			
		}
		
		else {
			
			return COLOR;
			
		}
		
	}
	
	public static char comprobarConsumoEnergetico(char consumoEnergetico) {
		
		if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			
			return consumoEnergetico;
			
		}
		
		else {
			
			return CONSUMO_ENERGETICO;
			
		}
		
	}
	
	public static int precioFinal(int precioBase, int peso, int consumoEnergetico) {
		
		int precioFinal = precioBase;
		
		switch(consumoEnergetico) {
			case 'A':
				precioFinal+=100;
			case 'B':
				precioFinal+=80;
			case 'C':
				precioFinal+=60;
			case 'D':
				precioFinal+=50;
			case 'E':
				precioFinal+=30;
			case 'F':
				precioFinal+=10;
		}
		
		if (peso >= 0 && peso < 20) {
			precioFinal+=10;
		}
		else if (peso >= 20 && peso < 50) {
			precioFinal+=50;
		}
		else if (peso >= 50 && peso < 80) {
			precioFinal+=80;
		}
		else if (peso >= 80) {
			precioFinal+=100;
		}
		
		return precioFinal;
		
	}
	
}

