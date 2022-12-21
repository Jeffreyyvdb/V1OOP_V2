package Practica.Practicum_9B.Werkboek.les1.opdracht4;

public class Student {
    private String naam;

    public Student(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }
    public String toString(){
        return String.format("Deze student heet " + naam);
    }
}
