import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);//tworzenie zmiennej skanera
		 boolean isStopped=false;//zmienna kontroluj�ca czy zatrzyma� zczytywanie
		 System.out.println("Program start!");
		 printMonit();//wyswietlanie znaku oznaczaj�cego wczytywanie
		 
	       while(sc.hasNextLine() && !isStopped){//Czy jest co� do zczyczytania // czy powinno zerwa� p�tle ( zosta�o wpisane stop)
	    	   String linia=sc.nextLine();//zczytyje inputa i zapisuje do zmiennej
	    	   if(linia.equals("stop"))//je�li zczytana warto�� jest r�wna stop...
	    		   isStopped=true;//zmie� zmienn� pomocnicz� na true
	    	   System.out.println(linia);//wypisz wpisany ci�g znak�w
	    	   printMonit();//wypisz znak wczytywania
	    	   
	       }
	       System.out.println("Program zako�czy� dzia�anie.");
		 
		 



	}
	
	private static void printMonit(){
		System.out.print(">");
	}

}
