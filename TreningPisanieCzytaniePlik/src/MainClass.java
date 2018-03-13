import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.print.attribute.standard.PrinterName;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("osoby.dat");
		File f_kobiety = new File("k.dat");
		File f_man = new File("m.dat");
		File f_dochod = new File("dochody.dat");
		Scanner sc = null;
		PrintWriter pw_k = null;
		PrintWriter pw_m = null;
		PrintWriter pw_d = null;
		int dochody_k=0;
		int dochody_m=0;
		
		
		
		
		try {
			sc = new Scanner(f);
			pw_k= new PrintWriter(f_kobiety);
			pw_m = new PrintWriter(f_man);
			pw_d = new PrintWriter(f_dochod);
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				StringTokenizer st = new StringTokenizer(linia);
				String plec = st.nextToken();
				String imie = st.nextToken();
				String nazwisko = st.nextToken();
				Integer dochod = Integer.valueOf(st.nextToken());
				if(plec.equals("K")) {
					pw_k.println(imie+" "+nazwisko);
					pw_k.flush();
					dochody_k+=dochod;
				}
				else {
					pw_m.println(imie+" "+nazwisko);
					pw_m.flush();
					dochody_m+=dochod;
				}			
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			pw_k.close();
			pw_m.close();
			pw_d.println("Kobiety: "+dochody_k);
			pw_d.flush();
			pw_d.println("Mezczyzni: "+dochody_m);
			pw_d.close();
		}
		
		

	}

}
