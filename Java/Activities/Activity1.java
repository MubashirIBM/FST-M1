package Activities;

public class Activity1 {
	public static void main(String[] args) {
		Car swift = new Car();
		swift.make = 2014;
		swift.color = "Black";
		swift.transmission = "Manual";
		//Using car class method
		swift.displayCharacteristics();
		swift.accelerate();
		swift.brake();
	}
}
