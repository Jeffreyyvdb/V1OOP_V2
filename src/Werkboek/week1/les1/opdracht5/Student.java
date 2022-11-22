package Werkboek.week1.les1.opdracht5;

public class Student {
    private String naam;
    private int studentNummer;

    public Student(String nm){
        naam = nm;
    }
    public Student(String nm, int stNr){
        naam = nm;
        studentNummer = stNr;
    }

    public String toString(){

        return String.format("Deze student heet " + naam + "en heeft nummer:"+ studentNummer);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }
}
