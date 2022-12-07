package Practica.Practicum_5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    public Klas(String kC){
        this.klasCode = kC;
        deLeerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        deLeerlingen.forEach(leerling -> {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
            }
        });
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("In klas %1$s zitten de volgende leerlingen:\n", klasCode));
        deLeerlingen.forEach(leerling -> {
            sb.append(leerling.toString() + "\n");
        });
        return sb.toString();
    }
}
