package ejercicio4;

public class Raices {

	private double a,b,c;
	
	//Único constructor, que debe recibir 3 parámetros
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Devuelve el discriminante
	public double getDiscriminate() {
		return (Math.pow(b, 2))-(4*a*c);
	}
	
	//Si el discriminante es mayor a 0 implica que tiene 2 raíces y devuelve true 
	public boolean tieneRaices() {
		if(getDiscriminate()>0) {
			return true;
		} else return false;
	}
	
	//Si el discriminante es igual a 0 implica que tiene 1 raíz, y devuelve true
	public boolean tieneRaiz() {
		if(getDiscriminate()==0) {
			return true;
		} else return false;
	}
	
	//hago los cálculos dependiendo si tiene 2 raíces o una, en caso que no tenga raíces implica que no tiene solución
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
	
	//calculo las raíces, si las tiene
	public void obtenerRaices() {
		if(tieneRaices()) {
			double raices = Math.sqrt(getDiscriminate());
			System.out.println("Las raíces son " + raices + " y " + (-raices));
			
		} else {
			System.out.println("La ecuación no posee 2 raíces");
		}
	}
	
	//Calculo su raiz, si es que solo posee una
	public void obtenerRaiz() {
		if(tieneRaiz()) {
			double raiz = Math.sqrt(getDiscriminate());
			System.out.println("La raíz es " + raiz);
			
		} else {
			System.out.println("La ecuación no posee una raíz");
		}
	}
	
}
