package Practica.Practicum_4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb){
        huisbaas = hb;
    }

    public Persoon getHuisbaas(){
        return huisbaas;
    }

    @Override
    public String toString(){
        return String.format("Huis %1$s is gebouwd in %2$s\nen heeft huisbaas %3$s", adres, bouwjaar, huisbaas);
    }
}
