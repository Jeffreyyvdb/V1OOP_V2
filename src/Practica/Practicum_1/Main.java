package Practica.Practicum_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        opdracht1();
        opdracht2();
        opdracht3();
        opdracht4();
        opdracht5();
    }

    static void opdracht1(){
        System.out.println("Opdracht 1: Getallenlijst: For");
        for (int i = 1; i<= 10; i++){
            System.out.println(i);
        }
    }
    static void opdracht2(){
        System.out.println("Opdracht 2: Getallenlijst: While");
        int getal = 1;
        while(getal <= 10) {
            System.out.println(getal);
            getal++;
        }
    }
    static void opdracht3(){
        System.out.println("Opdracht 3: Random getallen");
        for (int i = 0; i<10; i++) {
            System.out.println(Math.random());
        }
    }
    static void opdracht4(){
        System.out.println("Opdracht 4: Som van gehele getallen");
        int getal = 0;
        int som = 0;
        while(getal <= 39){
            som += getal;
            getal++;
        }
        System.out.println(som);
    }
    static void opdracht5(){
        for(int i = 0; i< 10; i++){
            if(i % 2 == 0){
                System.out.println("s");
            } else {
                System.out.println("ss");
            }
        }
    }
}