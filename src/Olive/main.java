package Olive;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {


        ArrayList<Olive> olives = new ArrayList<Olive>();


        Olive olive;

        olive = new Olive(3);
        System.out.println(olive.name);
        olives.add(olive);
        olive = new Olive(4);
        System.out.println(olive.name);
        olives.add(olive);
        olive = new Olive(6);
        System.out.println(olive.name);
        olives.add(olive);


        OlivePress press = new OlivePress();

        press.getOil(olives);

        press.getName(olives);




    }
}
