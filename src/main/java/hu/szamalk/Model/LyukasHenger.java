package hu.szamalk.Model;

public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger(int i, double sugar, double magassag) {
        this(sugar, magassag,1,falvastagsag);

    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public String toString() {

        String os = super.toString();
        return os + "<I--LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }
}
