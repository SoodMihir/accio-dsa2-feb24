package Lec3;

interface A{
	int a=10;
	void tell();
}

interface B{
	int b = 5;
	void tell();
}

class C implements A,B{

	@Override
	public void tell() {
		System.out.println("In C");
	}
	
}

public class MultipleInheritence {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.b);
		c.tell();
	}

}
