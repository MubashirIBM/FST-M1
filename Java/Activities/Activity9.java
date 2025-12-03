package Activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Kohli");
		myList.add("Sky");
		myList.add("Sunil");
		myList.add(3,"Abhishek");
		myList.add(1,"Irfan");
		for(String s : myList) {
			System.out.println(s);			
		}
		System.out.println("Name at 3rd index: " + myList.get(2));
		System.out.println("Size of the array is: " + myList.size());
		System.out.println("Is Kohli is in list: " + myList.contains("Kohli"));
		myList.remove("Kohli");
		for(String s : myList) {
			System.out.println(s);			
		}
	}
	
	

}
