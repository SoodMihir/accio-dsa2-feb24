package Lec2;

class Fruit{
	String colour;
	int sweetness;
	int getSweetRatio( int size) {
		return sweetness/size;
	}
}
class Apple extends Fruit{
	int sweetness = 10;
	int getSweetRatio(int size) {
		return super.getSweetRatio(size)*3;
	}
}
class Orange extends Fruit{
	int sweetness = 5;
	int getSweetRatio(int size) {
		return (this.sweetness/size)/2;
	}
}
public class zoverridingDemo {
	public static void main(String[] args) {
//		Fruit f = new Fruit();
		Apple a = new Apple();
		Orange o = new Orange();
//		Fruit.getSweetRatio(10);
		System.out.println(a.getSweetRatio(1));
		System.out.println(o.getSweetRatio(1));
	}
}
