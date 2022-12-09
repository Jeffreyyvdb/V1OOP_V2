package Practica.Practicum_8;

public class Main {
    public static void main(String[] args){
//        1.	Maak een BedrijfsInventaris-object aan met voldoende budget.
        BedrijfsInventaris inventaris = new BedrijfsInventaris("testBedrijf",10000000);

//        2.	Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
        Computer computer1 = new Computer("Dell","00:00:5e:00:53:af", 1500, 2017);
        Computer computer2 = new Computer("Dell","00:00:5e:00:53:af", 1500, 2017);

//        3.	Doe dit ook voor Fiets en Auto.
        Fiets fiets1 = new Fiets("Mountain bike", 800,2021, 158763245);
        Fiets fiets2 = new Fiets("Mountain bike", 800,2021, 158763245);

        Auto auto1 = new Auto("Mercedes", 50000,2016, "46-DKL-3");
        Auto auto2 = new Auto("Mercedes", 50000,2016, "46-DKL-3");

//        4.	Maak ook nog een auto, fiets en computer met andere eigenschappen.
        Computer computer3 = new Computer("HP","03:00:8d:00:53:ac", 1200, 2019);
        Fiets fiets3 = new Fiets("Race fiets", 1200,2022, 589657423);
        Auto auto3 = new Auto("Audi", 60000,2005, "1-AKL-23");


//        5.	Probeer alle objecten aan de bedrijfsinventaris toe te voegen.
        inventaris.schafAan(computer1);
        inventaris.schafAan(computer2);
        inventaris.schafAan(fiets1);
        inventaris.schafAan(fiets2);
        inventaris.schafAan(auto1);
        inventaris.schafAan(auto2);
        inventaris.schafAan(computer3);
        inventaris.schafAan(fiets3);
        inventaris.schafAan(auto3);

//        6.	Print de BedrijfsInventaris
        System.out.println(inventaris.toString());

    }
}
