package hu.szamalk.Model;

public class MertaniHenger {
    private static int hengerDb;
    private double sugar, magassag;

    public static int getHengerDb() {
        return hengerDb;
    }

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
