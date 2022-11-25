package Werkboek.les3.opdracht2;

public class TariefFabriek {

    public static void main(String[] args) {
        BelastingTarieven belastingTarieven = new BelastingTarieven();
        boolean generenGeslaagd = false;

        while (generenGeslaagd == false) {
            try {
                belastingTarieven.produceerBelastingTarieven();
                generenGeslaagd = true;
            } catch (ArithmeticException ae) {
                generenGeslaagd = false;
                System.out.println("mislukt");
            }
        }
    }
}
