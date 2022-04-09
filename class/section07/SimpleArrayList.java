package section07;

import java.util.ArrayList;

public class SimpleArrayList {

	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    //to add elements
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //to print elements
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
	    }
	    // to print elements with short loop
		/*
		 * for (String i : cars) { System.out.println(i); }
		 */
	    
	    // to add elements in a particular index
	    cars.set(0, "Opel");
	    
		/*
		 * for (String i : cars) { System.out.println(i); }
		 */
	    
	    //to remove the element from the arrayList
	    cars.remove(0);
	    
	    //to remove all elements from an arrayList
	    //cars.clear();
	    
	    
	  }

}
