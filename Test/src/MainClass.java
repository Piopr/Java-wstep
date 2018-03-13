import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//tworzenie zmiennej skanera
		 boolean isStopped=false;//zmienna kontroluj¹ca czy zatrzymaæ zczytywanie
		 System.out.println("Program start!");
		 printMonit();//wyswietlanie znaku oznaczaj¹cego wczytywanie
		 
	       while(sc.hasNextLine() && !isStopped){//Czy jest coœ do zczyczytania // czy powinno zerwaæ pêtle ( zosta³o wpisane stop)
	    	   String linia=sc.nextLine();//zczytyje inputa i zapisuje do zmiennej
	    	   if(linia.equals("stop"))//jeœli zczytana wartoœæ jest równa stop...
	    		   isStopped=true;//zmieñ zmienn¹ pomocnicz¹ na true
	    	   System.out.println(linia);//wypisz wpisany ci¹g znaków
	    	   printMonit();//wypisz znak wczytywania
	    	   
	       }
	       System.out.println("Program zakoñczy³ dzia³anie.");
		 
		 



	}
	
	private static void printMonit(){
		System.out.print(">");
	}

}
