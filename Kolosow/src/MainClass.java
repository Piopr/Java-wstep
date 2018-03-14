import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f_in = new File("input.dat");
		File f_out = new File("output.dat");
		Scanner sc = null;
		PrintWriter pw = null;
		//StringTokenizer st = null;
		
		try {
			sc = new Scanner(f_in);
			pw = new PrintWriter(f_out);
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				StringTokenizer st = new StringTokenizer(linia);
				String pierwszy = st.nextToken();
				String drugi = st.nextToken();
				pw.println(drugi+" "+pierwszy);
				pw.flush();
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
			pw.close();
		}
		

	}

}
