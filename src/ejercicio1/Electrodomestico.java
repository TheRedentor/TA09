package ejercicio1;

public class Electrodomestico {

	// atributos
	public int precioBase;
	public String color;
	public char consumoEnergetico;
	public int peso;

	// atributos por defecto
	static final int PRECIO_BASE = 100;
	static final String COLOR = "Blanco";
	static final char CONSUMO_ENERGETICO = 'F';
	static final int PESO = 5;

	// constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;

	}

	// constructor
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
	}

	// constructor
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Comprueba que el color del producto sea correcto, sino asigna el color por
	// defecto
	public String comprobarColor(String color) {
		boolean esValido = false;
		for (Colores col : Colores.values()) {
			if (color.toLowerCase().equals(col.toString().toLowerCase())) {
				esValido = true;
			}
		}
		if (esValido) {
			return color;
		} else {
			return COLOR;
		}
	}

	// comprueba que la letra del consumo energético sea correcta, sino asigna la
	// por defecto
	public char comprobarConsumoEnergetico(char consumoE) {
		boolean esValido = false;
		for (ConsumoEnergetico ce : ConsumoEnergetico.values()) {
			if (consumoE == ce.toString().charAt(0)) {
				esValido = true;
			}
		}
		if (esValido)
			return consumoE;
		else {
			return CONSUMO_ENERGETICO;
		}

	}

	//calcula el precio final según el consumo energético y el peso
	public int precioFinal() {

		int precioFinal = precioBase;

		switch (consumoEnergetico) {
		case 'A':
			precioFinal += 100;
		case 'B':
			precioFinal += 80;
		case 'C':
			precioFinal += 60;
		case 'D':
			precioFinal += 50;
		case 'E':
			precioFinal += 30;
		case 'F':
			precioFinal += 10;
		}

		if (peso >= 0 && peso < 20) {
			precioFinal += 10;
		} else if (peso >= 20 && peso < 50) {
			precioFinal += 50;
		} else if (peso >= 50 && peso < 80) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;

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

}
