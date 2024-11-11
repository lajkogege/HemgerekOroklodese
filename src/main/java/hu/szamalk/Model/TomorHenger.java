package hu.szamalk.Model;

public class TomorHenger extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag,1);
        //this.fajsuly=1; ez a megoldás is jo
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);//ős konstruktor meghivodik
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
