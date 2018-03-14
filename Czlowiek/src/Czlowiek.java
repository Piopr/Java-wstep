
public class Czlowiek {

	private String imie, nazwisko;
	private int rokUrodzenia;
	
	public Czlowiek(String imie, String nazwisko, int rokUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
	}
	
	
	public String getImie() {
		return imie;
	}


	public void setImie(String imie) {
		this.imie = imie;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public int getRokUrodzenia() {
		return rokUrodzenia;
	}


	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}
	
	@Override
	public String toString() {
		return imie+" "+nazwisko+" "+rokUrodzenia;
	}
	

	
}
