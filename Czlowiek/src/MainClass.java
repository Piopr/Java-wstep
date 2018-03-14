import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Czlowiek c1 = new Czlowiek("Roman", "Polañski", 1950);
//		System.out.println(c1);
//		Czlowiek[] tablica = new Czlowiek[5];
//		tablica[0] = new Czlowiek("Maria", "Konopnicka", 1842);
//		tablica[1] = new Czlowiek("Jan", "Kiepura", 1902);
//		tablica[2] = new Czlowiek("Zenon", "Xenon", 2000);
//		tablica[3] = new Czlowiek("Mariola", "Orzeszkowa", 1856);
//		tablica[4] = new Czlowiek("Henryk", "Sienkiewicz", 1846);
//		
//		for(Czlowiek c : tablica) {
//			System.out.println(c);
//			
//		}
		
		File f = new File("input.dat");
		File f_out = new File("output.dat");
		Scanner sc = null;
		PrintWriter pw = null;
		Czlowiek[] tablica = new Czlowiek[5];
		int i=0;
		
		try {
			sc = new Scanner(f);
			pw = new PrintWriter(f_out);
			
			while(sc.hasNextLine()) {				
				String linia = sc.nextLine();
				StringTokenizer st = new StringTokenizer(linia);
				String imie = st.nextToken();
				String nazwisko = st.nextToken();
				int rok = Integer.valueOf(st.nextToken());				
				tablica[i] = new Czlowiek(imie, nazwisko, rok);
				i++;
				
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			sc.close();
			
		}
		
	for(Czlowiek c : tablica) {
	System.out.println(c);
	
	}

	}

}
