package Activities;

import java.util.HashMap;

public class Activity11 {
	public static void main(String[] args) {
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();
		hash_map.put(1,"Red");
		hash_map.put(2,"Orange");
		hash_map.put(3,"Green");
		hash_map.put(4,"White");
		hash_map.put(5,"Yellow");
		System.out.println("The original map: " + hash_map);
		hash_map.remove(2);
		System.out.println("The map after removing Orange : " + hash_map);
		if(hash_map.containsValue("Green")) {
			System.out.println("Green Color is present");
		} else {
			System.out.println("Green color is not present");
		}
		System.out.println("Number of pairs in the Map: " + hash_map.size());
	}
}
