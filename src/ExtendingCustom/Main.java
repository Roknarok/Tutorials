package ExtendingCustom;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		ArrayList<Olive> olives = new ArrayList<Olive>();
		
		Olive olive;
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Ligurian();
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
	
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + 
				" units of oil");
		
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + 
				" units of oil");


		Kalamata olives1 = (Kalamata)olives.get(0);
		System.out.println(olives1.getOrigin());



	}

}
