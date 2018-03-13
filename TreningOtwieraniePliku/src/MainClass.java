import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("output.dat");//otwarcie pliku
		PrintWriter pw=null;//zmienna, która bêdzie forsowaæ wpisywanie do pliku
		try {
			pw=new PrintWriter(f);//inicjalizacja zmiennej PrintWiterem
			for(int i=0;i<10;i++) {
				pw.println(i+" siema");//wpisanie do pliku
				pw.flush();//wymusza wpisanie do pliku. oznacza, ¿e nie oczekuje na dalsze dane
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			pw.close();
		}

	}

}
