
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prostokat[] tablica = new Prostokat[4];
		tablica[0] = new Prostokat(15, 20);
		tablica[1] = new Prostokat(11, 23);
		tablica[2] = new Prostokat(10, 20);
		tablica[3] = new Prostokat(5, 25);
		
		for(Prostokat p : tablica) {
			
			System.out.println(p);
		}

	}

}
