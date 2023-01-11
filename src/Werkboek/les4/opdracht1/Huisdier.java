package Werkboek.les4.opdracht1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setBaasje(Eigenaar e) {
        baasje = e;
    }

    public Eigenaar getBaasje() {
        return baasje;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas() {
        return ras;
    }

    public String toString() {
        String str = String.format("%1$s, de  %2$s, weegt  %3$s kg", naam, ras, gewicht);
        str += String.format("\nEn de eigenaar is :  %1$s", baasje);
        return str;
    }
}

