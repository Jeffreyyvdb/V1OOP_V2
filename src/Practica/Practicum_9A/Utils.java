package Practica.Practicum_9A;

import java.text.NumberFormat;

public class Utils {
    private static int count;

    public Utils(){
        count++;
    }
    public static void main(String[] args){
        System.out.println("Iets kost : " + euroBedrag(123));
        System.out.println("Iets kost : " + euroBedrag(12332.3343, 4));
    }
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setMaximumFractionDigits(precisie);
        currencyFormat.setMinimumFractionDigits(precisie);
        return currencyFormat.format(bedrag);
    }

    public static int getCount() {
        return count;
    }
}
