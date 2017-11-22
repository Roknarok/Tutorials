package Olive;

import java.util.ArrayList;

public class OlivePress {

    public void getOil(ArrayList<Olive> olives){


        int oil = 0;


        for(Olive olive: olives){

            oil += olive.crush();

        }

        System.out.println("You got " + oil + " liters");
    }

    public int getOil(int oil){
        return oil;
    }

    public void getName(ArrayList<Olive> olives){

        String c;
        StringBuilder sb = new StringBuilder();

        for(Olive olive: olives){

        String b = new String();


        b += olive.name();

            System.out.println(b);

        }

    }



}
