package Olive3;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        ArrayList<Olive> olives = new ArrayList<Olive>();


        Olive kalamata1 = new Kalamata();
        Olive kalamata2 = new Kalamata();
        Olive liguria1 = new Liguria();

        olives.add(kalamata1);
        olives.add(kalamata2);
        olives.add(liguria1);


        OilMachine machine = new OilMachine();

        machine.getOil(olives);











    }

}
