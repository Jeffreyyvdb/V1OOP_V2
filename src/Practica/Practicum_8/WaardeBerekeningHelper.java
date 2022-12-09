package Practica.Practicum_8;

import java.time.LocalDate;

public class WaardeBerekeningHelper {
    public static double berekenWaardeNaAantalJaar(double nieuwPrijs, double procentueleVerandering, int aantalJaar){

        double factorPerJaar = (100.0 + procentueleVerandering) / 100.0;
        if (aantalJaar <= 0) {
            return nieuwPrijs;
        }
        // per jaar afhalen
        double factor =  Math.pow(factorPerJaar, aantalJaar);
        return nieuwPrijs * factor;
    }
}
