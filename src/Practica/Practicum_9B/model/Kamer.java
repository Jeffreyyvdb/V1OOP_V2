package Practica.Practicum_9B.model;

public class Kamer {
	private int kamerNummer;
	private boolean extraBed = false;
	private KamerType hetType;
	
	public Kamer(int kN, KamerType tp) {
		kamerNummer = kN;
		hetType = tp;
	}
	
	public int getKamerNummer() {
		return kamerNummer;
	}

	public KamerType getKamerType() {
		return hetType;
	}

	public boolean equals(Object obj) {
		boolean gelijk = obj instanceof Kamer;

		gelijk = gelijk && ((Kamer)obj).kamerNummer == kamerNummer;
		gelijk = gelijk && ((Kamer)obj).extraBed == extraBed;
		gelijk = gelijk && ((Kamer)obj).hetType.equals(hetType);

		return gelijk;
	}

	public String toString() {
		String s = "kamer: " + kamerNummer + " van type: " + hetType;
		return s + " extra bed mogelijk: " + (extraBed ? "nee" : "ja");
	}
} 