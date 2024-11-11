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

    public double  suly(){
        return 0.0;
    }

    @Override
    public String toString() {

        String os = super.toString();
        return os + "<I--TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
