
public class Prostokat {
	
	private int a,b;

	public Prostokat(int a, int b) {		
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getObwod() {
		return 2*a+2*b;
		
	}
	
	public int getPole() {
		return a*b;
	}
	@Override
	public String toString() {		
		return "Pole: "+this.getPole()+", obwod: "+this.getObwod();
	}
	
	

}
