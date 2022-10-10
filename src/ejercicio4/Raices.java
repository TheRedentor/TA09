package ejercicio4;

public class Raices {

	private double a,b,c;

	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminate() {
		return (Math.pow(b, 2))-(4*a*c);
	}
	
	public boolean tieneRaices() {
		if(getDiscriminate()>=0) {
			return true;
		} else return false;
	}
	
	public boolean tieneRaiz() {
		if(getDiscriminate()==0) {
			return true;
		} else return false;
	}
	
	public void calcular() {
		
		double discriminante = getDiscriminate();
		
		if(tieneRaices()) {
			double solucion1 = (-b+Math.sqrt(discriminante))/(2*a);
			double solucion2= (-b-Math.sqrt(discriminante))/(2*a);
			System.out.println("La ecuación tiene 2 soluciones: " + solucion1 + " y " + solucion2);
		} else if(tieneRaiz()) {
			double solucion = (-b)/(2*a);
			System.out.println("La solución es " + solucion);
		} else {
			System.out.println("No tiene solución");
		}
	}
	
	public void obtenerRaices() {
		if(tieneRaices()) {
			double raices = Math.sqrt(getDiscriminate());
			System.out.println("Las raíces son " + raices + " y " + (-raices));
		} else {
			System.out.println("La ecuación no posee 2 raíces");
		}
	}
	
	public void obtenerRaiz() {
		if(tieneRaiz()) {
			double raiz = Math.sqrt(getDiscriminate());
			System.out.println("La raíz es " + raiz);
		} else {
			System.out.println("La ecuación no posee una raíz");
		}
	}
	
}
