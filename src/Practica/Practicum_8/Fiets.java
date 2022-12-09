package Practica.Practicum_8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp,pr,jr);
        this.framenummer = fnr;
    }

    @Override
    public double huidigeWaarde(){
        int aantalJaarNaAanschaf = LocalDate.now().getYear() - this.bouwjaar;
        return WaardeBerekeningHelper.berekenWaardeNaAantalJaar(this.nieuwprijs,
                -20.0,
                aantalJaarNaAanschaf);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Fiets andereFiets)) {
            return false;
        }
        return this.framenummer == andereFiets.framenummer
                && this.bouwjaar == andereFiets.bouwjaar
                && this.nieuwprijs == andereFiets.nieuwprijs;
    }
}
