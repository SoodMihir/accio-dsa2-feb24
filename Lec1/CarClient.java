package Lec1;

public class CarClient {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.modelName+" "+car.getPrice());

		Car car1 = new Car("Audi", "Black", 10000);
		System.out.println(car1.modelName+" "+car1.getPrice());
		
		
		Car car2 = new Car("BMW", 10000);
		System.out.println(car2.modelName+" "+car2.color+" "+car2.getPrice());
	}

}
