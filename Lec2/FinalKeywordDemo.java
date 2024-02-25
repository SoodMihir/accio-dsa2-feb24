package Lec2;

class A{
	final void A() {
		System.out.println("In final method");
	}
	final void A(int a) {
		System.out.println("In final method "+ a);
	}
	
	void tell() {
		System.out.println("In A");
	}
}

class B extends A{
	int shape=100;
//	@Override
//	void A() {
//		
//	}
	
	void tell() {
		System.out.println("In B");
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
//		final int a = 10;
//		a = 50;
		B b = new B();
		b.A();
		b.A(1);
		
//		A a = new A();
		A a2 = new B(); // Upcasting
		a2.A();
		a2.tell();
		System.out.println(((B)a2).shape);
		
	}

}
