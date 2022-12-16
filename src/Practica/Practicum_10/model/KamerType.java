package Practica.Practicum_10.model;

public class KamerType {
	private String typeNaam;
	private int aantalBedden;
	private double prijsPerNacht;

	public KamerType(String tN, int aB, double prijs) {
		typeNaam = tN;
		aantalBedden = aB;
		prijsPerNacht = prijs;
	}

	public String getTypeNaam() {
		return typeNaam;
	}

	public int getAantalBedden() {
		return aantalBedden;
	}

	public double getPrijsPerNacht() {
		return prijsPerNacht;
	}

	public boolean equals(Object obj) {
		boolean gelijk = obj instanceof KamerType;
		
		gelijk = gelijk && ((KamerType)obj).typeNaam.equals(typeNaam);
		gelijk = gelijk && ((KamerType)obj).aantalBedden == aantalBedden;
		gelijk = gelijk && ((KamerType)obj).prijsPerNacht == prijsPerNacht;
		
		return gelijk;
	}

	public String toString() {
		String s = typeNaam + ", bedden: " + aantalBedden;
		s += ", € " + prijsPerNacht + " p.n.";
		return s;
	}
}