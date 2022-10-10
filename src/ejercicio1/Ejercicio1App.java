package ejercicio1;

import ejercicio1.Electrodomestico;

public class Ejercicio1App {

	public static void main(String[] args) {
		
		int precioTotalElectrodomesticos = 0;
		int precioTotalLavadoras = 0; 
		int precioTotalTelevisiones = 0;
		Electrodomestico[] electrodomesticos = iniciarElectrodomesticos();
		
		//sumamos el precio total separando según sea electrodoméstico general, televisor o lavadora
		for(int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				precioTotalElectrodomesticos += electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadoras += electrodomesticos[i].precioFinal();
			}
			else if (electrodomesticos[i] instanceof Television) {
				precioTotalTelevisiones += electrodomesticos[i].precioFinal();
			}
			
		}
		
		System.out.println("Electrodom�sticos: " + precioTotalElectrodomesticos + "�");
		System.out.println("Lavadoras: " + precioTotalLavadoras + "�");
		System.out.println("Televisiones: " + precioTotalTelevisiones + "�");

	}
	
	//creamos electrodomésticos, televisores  lavadoras
	public static Electrodomestico[] iniciarElectrodomesticos() {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Electrodomestico(110, "Negro", 'D', 60);
		electrodomesticos[1] = new Electrodomestico(250, "Rojo", 'C', 70);
		electrodomesticos[2] = new Electrodomestico(110, "Gris", 'B', 25);
		electrodomesticos[3] = new Electrodomestico(150, "Blanco", 'F', 80);
		electrodomesticos[4] = new Television(100, "Negro", 'A', 35, 15, false);
		electrodomesticos[5] = new Television(30, "Azul", 'B', 20, 20, true);
		electrodomesticos[6] = new Television(80, "Rojo", 'E', 60, 15, false);
		electrodomesticos[7] = new Electrodomestico(100, "Blanco", 'F', 30);
		electrodomesticos[8] = new Lavadora(100, "Azul", 'D', 20, 30);
		electrodomesticos[9] = new Lavadora(100, "Gris", 'B', 50, 5);

		return electrodomesticos;
	}

}
