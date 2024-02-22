package Lec1;

public class Car {
	String modelName;
	String color;
	int price;
	public static int noOfWheels = 4;
	
	// Constructors
	
	// default constructor
	Car(){
		System.out.println("In default constructor");
		modelName = "NotSpecified";
		color = "NotSpecified";
		price = 0;
	}
	
	// parameterised constructor
	Car(String mn, String c, int p){
		System.out.println("In parameterised constructor");
		modelName = mn;
		color = c;
		price = p;
	}
	
	Car(String mn, int p){
		System.out.println("In parameterised constructor");
		modelName = mn;
		color = "NotSpecified";
		price = p;
	}
	
	
	void drive() {
		System.out.println(modelName+" is running");
	}
	
	void lock() {
		System.out.println(modelName+" is locked");
	}
	
	void unlock() {
		System.out.println(modelName+" is unlocked");
	}
	
//	setter
	void setPrice(int np) {
		if(np<0) {
			return;
		}
		price = np;
	}
	
	public int getPrice() {
		return price;
	}

}
