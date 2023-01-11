package Werkboek.les2.opdracht1;

public class Piloot {
    private String naam;
    private double salaris;
    private int vliegUren;
    public Piloot(String naam) {
        this.naam = naam;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }
    public double getSalaris() {
        return salaris;
    }
    public int getVlieguren() {
        return vliegUren;
    }
    public void verhoogVliegurenMet(int aantal) {
        vliegUren += aantal;
    }
    public String toString(){
        return naam + " heeft "+vliegUren+" vlieguren gemaakt en verdient " + salaris;
    }
}
