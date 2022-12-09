package Practica.Practicum_8;

import Practica.Practicum_9.Utils;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        int aantalJaarNaAanschaf = LocalDate.now().getYear() - this.productieJaar;
        return WaardeBerekeningHelper.berekenWaardeNaAantalJaar(this.aanschafPrijs,
                -40.0,
                aantalJaarNaAanschaf);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Computer andereComputer)) {
            return false;
        }
        return this.type.equals(andereComputer.type)
        && this.macAdres.equals(andereComputer.macAdres)
        && this.aanschafPrijs == andereComputer.aanschafPrijs
        && this.productieJaar == andereComputer.productieJaar;
    }

    @Override
    public String toString(){
        //Mercedes-Benz A-klasse A 180 met bouwjaar 2019 heeft een waarde van: €20996.5
        return String.format("%1$s met productiejaar %2$s heeft een waarde van %3$s",
                this.type, this.productieJaar, Utils.euroBedrag(this.huidigeWaarde()));
    }
}
