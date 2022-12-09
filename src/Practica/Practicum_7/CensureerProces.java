package Practica.Practicum_7;

import java.util.ArrayList;

public class CensureerProces implements OpmaakProces {
    static final String CENSUUR_STRING = "****";
    private ArrayList<String> woordenTeCensureren;

    public CensureerProces(ArrayList<String> woordenTeCensureren){
        this.woordenTeCensureren = woordenTeCensureren;
    }
    @Override
    public String maakOp(String input) {
        for (String woord: woordenTeCensureren) {
            input = input.replace(woord, CENSUUR_STRING);
        }
        return input;
    }
}
