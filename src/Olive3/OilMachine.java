package Olive3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class OilMachine {


    public int TotalOil = 0;


    public void getOil(ArrayList<Olive> olive){

        for (Olive olives : olive){

            TotalOil += olives.crush();


        }
        System.out.println(TotalOil);
    }

}
