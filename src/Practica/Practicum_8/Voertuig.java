package Practica.Practicum_8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Voertuig anderVoertuig)) {
            return false;
        }
        return this.type.equals(anderVoertuig.type)
                && this.bouwjaar == anderVoertuig.bouwjaar
                && this.nieuwprijs == anderVoertuig.nieuwprijs;
    }

    @Override
    public String toString(){
        //Mercedes-Benz A-klasse A 180 met bouwjaar 2019 heeft een waarde van: €20996.5
        return String.format("%1$s met bouwjaar %2$s heeft een waarde van €%3$.2f",
                this.type, this.bouwjaar,this.huidigeWaarde());
    }
}
