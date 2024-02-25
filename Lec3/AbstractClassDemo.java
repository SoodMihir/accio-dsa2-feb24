package Lec3;

abstract class Car{
	int cap;
	Car(int cap){
		this.cap = cap;
		System.out.println("In car constructor");
	}
	abstract void run();
	void park() {
		System.out.println("Car is parked");
	}
}
class BMW extends Car{
	BMW(int cap) {
		super(cap);
	}

	@Override
	void run() {
		System.out.println("BMW is running");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Car c = new BMW(3);
		c.run();
		c.park();
		BMW b = new BMW(2);
		b.run();
		b.park();
//		System.out.println(Car.cap);
//		Car c2 = new Car(1);
	}

}

abstract class Message{
	abstract void sendMessage(int phoneNumber, String message);
	abstract void receiveMessage();
}

abstract class Chat extends Message{
	abstract void isOnline();
}

class SMS extends Chat{

	@Override
	void isOnline() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sendMessage(int phoneNumber, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void receiveMessage() {
		// TODO Auto-generated method stub
		
	}
	
}

