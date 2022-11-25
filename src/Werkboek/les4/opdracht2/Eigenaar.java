package Werkboek.les4.opdracht2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setBeestje(Huisdier hd) {
        this.beestje = hd;
    }

    public Huisdier getBeestje() {
        return beestje;
    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr()  { return giroNr; }
    public String getNaam() { return naam; }

    public String toString() {
        return String.format("%1$s heeft giro %2$s. En is het baasje van %3$s", naam, giroNr, beestje);
    }
}

