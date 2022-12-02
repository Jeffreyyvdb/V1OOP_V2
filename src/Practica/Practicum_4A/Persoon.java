package Practica.Practicum_4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        this.naam = nm;
        this.leeftijd = lft;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString(){
        return String.format("%1$s; leeftijd %2$s jaar", naam, leeftijd);
    }
}
