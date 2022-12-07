package Practica.Practicum_6B.Opdracht2;

import Practica.Practicum_6A.Game;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);

        p1.koop(g1);

        ArrayList<Game> teKoop = new ArrayList<Game>();
        teKoop.add(g1);
        teKoop.add(new Game("Mario Kart 8", 2019, 35.00));
        ArrayList<Game> nogNietInBezit = p1.bepaalGamesNietInBezit(teKoop);
        System.out.println("p1 heeft de volgende games nog niet: " + nogNietInBezit.toString());
    }
}
