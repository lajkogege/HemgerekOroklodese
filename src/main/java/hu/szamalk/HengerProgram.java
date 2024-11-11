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
        MertaniHenger m = new MertaniHenger(1, 1);
        TomorHenger t = new TomorHenger(1, 1);
        LyukasHenger ly = new LyukasHenger(1,1, .5);
        System.out.println("m="+m);
        System.out.println("t="+t);
        System.out.println("ly="+ly);

    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }

    public double atlagTerfogat(){
        return 0.0;
    }

    public double csovekSulya(){
        return 0.0;
    }

    private List<MertaniHenger> hengerek;




}
