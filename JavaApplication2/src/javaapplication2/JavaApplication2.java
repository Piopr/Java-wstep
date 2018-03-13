package javaapplication2;


public class JavaApplication2 {
    public static void nazwaMetody(Integer[][] argument){
        for (int i = 0; i<argument.length; i++) {
            //jesli za pomoca dwoch petli, to dodac zakomentowany kod i usunac linijke oznaczona "dupa"
            /*dupa*/System.out.println(argument[i][0]+" "+argument[i][1]);  
            //for(int j=0;j<2;j++){            
                //System.out.print(argument[i][j]);
             //}
             //System.out.print("\n");
        }        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[][] tablica = new Integer[3][3];
        for (int i=0; i<tablica.length; i++){
            tablica[i][0]=i+1;
            tablica[i][1]=i+1;            
        }
        nazwaMetody(tablica);  
        String test = new String();
        test = "Siemanko";
        
    }    
}
