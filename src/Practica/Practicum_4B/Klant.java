package Practica.Practicum_4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        this.naam = nm;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString(){
        return String.format("%1$s (korting: %2$s", naam, kortingsPercentage) + "%)";
    }
}
