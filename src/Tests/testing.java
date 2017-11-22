package Tests;

import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;

import java.util.*;

public class testing {



    public static void main(String[] args) {


        ArrayList<String> states = new ArrayList<String>();

        states.add("California");
        states.add("Oregon");
        states.add("Washington");

        ListIterator<String> ListIterator = states.listIterator();

        while (ListIterator.hasNext()){
            String value = ListIterator.next();
            System.out.println(value);
        }


        HashMap<String, String> map = new HashMap<String, String>();


        map.put("California","Sacramento");
        map.put("Oregon","Salem");
        map.put("Washington", "Olympia");
        map.put("Alaska","Juneau");

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();


        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }



    }



}