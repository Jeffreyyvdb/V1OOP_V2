package Practica.Practicum_4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;
    public AutoHuur(){

    }
    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }
    public int getAantalDagen() {
        return aantalDagen;
    }
    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }
    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }
    public void setHuurder(Klant k) {
        huurder = k;
    }
    public Klant getHuurder() {
        return huurder;
    }

    public double TotaalPrijs(){

        if( gehuurdeAuto == null){
            return 0;
        }
        double totaalPrijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();

        if( huurder != null){
            totaalPrijs = totaalPrijs * (1- huurder.getKorting() / 100);
        }

        return  totaalPrijs ;
    }
    @Override
    public String toString(){
        String autoTypeStr = gehuurdeAuto != null ? String.format("autotype : %1$s", gehuurdeAuto) : "er is geen auto bekend";
        String huurderStr = huurder != null ? String.format("op naam van : %1$s", huurder) : "er is geen huurder bekend";
        return String.format("%1$s\n%2$s\naantal dagen: %3$s en dat kost: %4$s",autoTypeStr,huurderStr,aantalDagen, TotaalPrijs());
    }
}
