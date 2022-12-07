package Practica.Practicum_6B.Opdracht2;

import Practica.Practicum_6A.Game;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
        // Als voldoende budget.
        // Als hij game nog niet bezit
        double huidigePrijs = g.huidigeWaarde();
        if(budget >= huidigePrijs && !mijnGames.contains(g)){
            budget = budget - huidigePrijs;
            mijnGames.add(g);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper){
        // Als hij de game zelf heeft
        // Als de koper de game nog niet heeft
        // Als de koper voldoende budget heeft
        if(mijnGames.contains(g)){
            double huidigePrijs = g.huidigeWaarde();
            if(!koper.mijnGames.contains(g) && koper.budget >= huidigePrijs ){
                koper.budget = koper.budget -  huidigePrijs;
                budget = budget + huidigePrijs;
                mijnGames.remove(g);
                koper.mijnGames.add(g);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        teKoop.removeAll(mijnGames);
        return teKoop;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%1$s heeft een budget van €%2$.2f en bezit de volgende games:",
                this.naam, this.budget));

        mijnGames.forEach(game -> {
            sb.append("\n" + game.toString());
        });

        return sb.toString();
    }
}
