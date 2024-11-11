package hu.szamalk;

import hu.szamalk.Model.LyukasHenger;
import hu.szamalk.Model.MertaniHenger;
import hu.szamalk.Model.TomorHenger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    public static void main(String[] args){
        new HengerProgram().run();
    }

    public void run(){
        int db = MertaniHenger.getHengerDb();
        System.out.printf("A feladatban használt hengerek (% db):\n ",db);
        for (MertaniHenger henger: hengerek){
            System.out.println(henger);
        }
        for(MertaniHenger henger : this.hengerek){
            System.out.println(henger);
        }
        System.out.println("Hemgerek átlag térfogata: "+this.atlagTerfogat());
        System.out.println("Csövek súlya"+this.csovekSulya());
    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
        hengerek.add( new MertaniHenger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new LyukasHenger(1,1, .5));
        hengerek.add(new LyukasHenger(1,1, .7));
        hengerek.add(new LyukasHenger(1,1, .8));

    }

    public double atlagTerfogat(){
        double osszeg=0;
        double atlag;
        for(MertaniHenger henger :hengerek){
            osszeg+=henger.terfogat();
        }
        atlag=osszeg/ MertaniHenger.getHengerDb();
        return atlag;
    }

    public double csovekSulya(){
        double ossz=0;
        for (MertaniHenger henger :  hengerek){
            if(henger instanceof  LyukasHenger)
            {
                //2.sorban
                //LyukasHenger h = (LyukasHenger) henger;
                //ossz+= h.suly();

                //1.sorban
                ossz+=((LyukasHenger) henger).suly();
            }

        }
        return 0.0;
    }

    private List<MertaniHenger> hengerek;




}
