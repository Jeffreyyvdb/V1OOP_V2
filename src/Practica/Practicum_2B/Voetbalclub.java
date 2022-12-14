package Practica.Practicum_2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;


    public Voetbalclub(String naam){
        this.setNaam(naam);
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }
    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public String getNaam() {
        return  naam;
    }

    public void setNaam(String naam) {
        if(naam.isEmpty() || naam == null){
            this.naam = "FC";
            return;
        }
        this.naam = naam ;
    }

    @Override
    public String toString(){
        return naam + " " + aantalGespeeld() + " " + getAantalGewonnen() + " " + getAantalGelijk() + " " + getAantalVerloren() + " " + aantalPunten();
    }
}
