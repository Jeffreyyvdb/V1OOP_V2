package Practica.Practicum_6A;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar1, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);

        System.out.println("p1 koopt g1:" + (p1.koop(g1) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g2:" + (p1.koop(g2) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g3:" + (p1.koop(g3) ? "" : " niet") + " gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        System.out.println("p1 verkoopt g2 aan p2:"+(p1.verkoop(g2, p2) ? "" : " niet")+" gelukt");
        System.out.println("p1 verkoopt g1 aan p2:"+(p1.verkoop(g1, p2) ? "" : " niet")+" gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");
    }
}
