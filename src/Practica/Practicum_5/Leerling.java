package Practica.Practicum_5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm){
        this.naam = nm;
    }

    public String getNaam(){
        return this.naam;
    }

    public double getCijfer(){
        return this.cijfer;
    }

    public void setCijfer(double c){
        this.cijfer = c;
    }

    @Override
    public String toString(){
        return String.format("%1$s heeft cijfer: %2$s",naam, cijfer);
    }
}
