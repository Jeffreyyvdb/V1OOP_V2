package Practica.Practicum_8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp,pr,jr);
        this.kenteken = kt;
    }

    @Override
    public double huidigeWaarde(){
        int aantalJaarNaAanschaf = LocalDate.now().getYear() - this.bouwjaar;
        return WaardeBerekeningHelper.berekenWaardeNaAantalJaar(this.nieuwprijs,
                -30.0,
                aantalJaarNaAanschaf);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Auto andereAuto)) {
            return false;
        }

        return this.kenteken.equals(andereAuto.kenteken)
                && this.bouwjaar == andereAuto.bouwjaar
                && this.nieuwprijs == andereAuto.nieuwprijs;
    }
}
