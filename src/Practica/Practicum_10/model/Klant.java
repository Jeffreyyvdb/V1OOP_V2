package Practica.Practicum_10.model;

public class Klant {
	private String naam;
	private String adres;
	
	protected Klant(String nm, String adr) {
		naam = nm;
		adres = adr;
	}
	
	public String getNaam() {
		return naam;
	}

	public String getAdres() {
		return adres;
	}

	public boolean equals(Object obj) {
		boolean gelijk = obj instanceof Klant;

		gelijk = gelijk && ((Klant)obj).naam.equals(naam);
		gelijk = gelijk && ((Klant)obj).adres.equals(adres);

		return gelijk;
	}
}