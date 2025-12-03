package Activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("M");
		hs.add("N");
		hs.add("A");
		hs.add("K");
		hs.add("I");
		hs.add("P");
		System.out.println("Original hashset: " + hs);
		System.out.println("Size of the Hashset is: " + hs.size());
		System.out.println("Removing A " +hs.remove("A"));
		if(hs.remove("B")) {
			System.out.println("B removed from the hashset");
		} else {
			System.out.println("B is not present in the hashset");
		}
		System.out.println("Is 'K' is the list: " + hs.contains("K"));
		System.out.println("Updated Hashset: " + hs);		
	}

}
