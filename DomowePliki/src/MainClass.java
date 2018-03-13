import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f_read = new File(args[0]);
		
		String nowa_nazwa = args[0].substring(0, args[0].lastIndexOf("."))+"_extract."+args[0].substring(args[0].lastIndexOf(".")+1, args[0].length());
		File f_out = new File(nowa_nazwa);
		Scanner sc = null;
		PrintWriter pw = null;
		
		try {
			sc = new Scanner(f_read);
			pw = new PrintWriter(f_out);
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				if(linia.equals(args[1])) {
					pw.println(linia);
				}
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
