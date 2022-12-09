package Practica.Practicum_8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud){
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }
    public void schafAan(Goed g){
        //Dat kan alleen als dat goed niet al een keer aan de inventaris is toegevoegd en als er voldoende budget is
        double huidigeWaarde = g.huidigeWaarde();
        if(!alleGoederen.contains(g) && budget > huidigeWaarde){
            budget = budget - huidigeWaarde;
            alleGoederen.add(g);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Goed goed : alleGoederen){
            sb.append("\n"+ goed.toString());
        }
        return sb.toString();
    }
}
