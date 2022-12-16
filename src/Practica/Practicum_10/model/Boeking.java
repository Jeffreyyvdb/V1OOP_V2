package Practica.Practicum_10.model;

import java.time.LocalDate;

public class Boeking {
	private LocalDate boekDatum, aankomstDatum, vertrekDatum;
	private Klant boeker;
	private Kamer geboekteKamer;
	
	protected Boeking(LocalDate aankomst, LocalDate vertrek) {
		boekDatum = LocalDate.now();
		aankomstDatum = aankomst;
		vertrekDatum = vertrek;
	}
	
	protected void setBoeker(Klant k) {
		boeker = k;
	}

	public Klant getBoeker() {
		return boeker;
	}
	
	protected void setKamer(Kamer k) {
		geboekteKamer = k;
	}

	public Kamer getKamer() {
		return geboekteKamer;
	}

	public LocalDate getBoekDatum() {
		return boekDatum;
	}

	public LocalDate getAankomstDatum() {
		return aankomstDatum;
	}
	
	public LocalDate getVertrekDatum() {
		return vertrekDatum;
	}

	public boolean equals(Object obj) {
		boolean gelijk = obj instanceof Boeking;

		gelijk = gelijk && ((Boeking) obj).boekDatum.isEqual(boekDatum);
		gelijk = gelijk && ((Boeking) obj).aankomstDatum.isEqual(aankomstDatum);
		gelijk = gelijk && ((Boeking) obj).vertrekDatum.isEqual(vertrekDatum);
		gelijk = gelijk && ((Boeking) obj).boeker.equals(boeker);
		gelijk = gelijk && ((Boeking) obj).geboekteKamer.equals(geboekteKamer);

		return gelijk;
	}
}