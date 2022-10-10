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
	
}
