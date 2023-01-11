package Practica.Practicum_11;

public class Artikel {
    private String naam;
    private double prijs;

    public Artikel (String naam, double prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijsInEuros) {
        this.prijs = prijsInEuros;
    }

    public static Artikel convertString(String artikelString){
        String[] splitLine = artikelString.split(":");
        String naam = splitLine[0];
        Double prijs = Double.parseDouble(splitLine[1]);

        Artikel artikel = new Artikel(naam, prijs);
        return artikel;
    }

    @Override
    public String toString() {
        return naam + ": " + String.format("%.2f", prijs) + "\n";
    }
}
