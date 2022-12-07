package Practica.Practicum_6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde(){
        // aantal jaar sinds release
        int jarenSindsRelease = LocalDate.now().getYear() - releaseJaar;
        // 30% per jaar afhalen
        return Math.pow(nieuwprijs * 0.7,jarenSindsRelease) ;
    }

    @Override
    public boolean equals(Object andereObject){
        if(andereObject instanceof Game){
            Game andereGame = (Game)andereObject;
            return this.naam.equals(andereGame.naam)
                    && this.releaseJaar == andereGame.releaseJaar;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("%1$s, uitgegeven in %2$s; nieuwprijs: €%3$s nu voor: €%4$.2f",
                naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}
