package ejercicio6;

import java.util.Random;

public class Espectador {
	
	private String nombre;
	private int edad;
	private float dinero;
	
	public Espectador() {
		super();
		Random r1 = new Random();
		Random r2 = new Random();
		
		this.edad = r1.nextInt(90);
		this.dinero = r2.nextInt(50);
	}

	public Espectador(String nombre) {
		super();
		Random r1 = new Random();
		Random r2 = new Random();
		
		this.nombre = nombre;
		this.edad = r1.nextInt(90);
		this.dinero = r2.nextInt(50);
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public float getDinero() {
		return dinero;
	}
	
	public void setDinero(float dinero) {
		this.dinero = dinero;
	}
	
}
