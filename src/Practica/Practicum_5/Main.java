package Practica.Practicum_5;

public class Main {
    public static void main(String[] arg) {
        Klas k = new Klas("V1Z");
        Leerling l = new Leerling("Hans");
        k.voegLeerlingToe(l);
        l = new Leerling("Jan");
        k.voegLeerlingToe(l);
        l = new Leerling("Wim");
        k.voegLeerlingToe(l);
        System.out.println(k);
        k.wijzigCijfer(new String("Hans"), 7.6);
        k.wijzigCijfer("Klaas", 7.6);
        System.out.println(k.toString());
        System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());
    }
}
