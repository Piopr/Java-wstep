import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("osoby.dat");//otwarcie pliku
		Scanner sc=null;//inicjalizowanie zmiennej sc nullem
		
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				StringTokenizer st = new StringTokenizer(linia);//jako token domyslnie traktuje spacje
				String imie = st.nextToken();//token domyslnie spacja
				String nazwisko = st.nextToken();
				System.out.println(nazwisko);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
