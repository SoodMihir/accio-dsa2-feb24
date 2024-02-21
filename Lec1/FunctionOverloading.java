package Lec1;

public class FunctionOverloading {

	public static void main(String[] args) {
//		func(5);
		System.out.println();
		func(1,2);
	}
	public static void func(int a) {
		System.out.println(2*a);
	}
	public static void func(int a, int b) {
		System.out.println(a+b);
	}
//	public static int func(int a, int b) {
//		return a+b;
//	}
	public static void func(double a, String b) {
		System.out.println(b+" "+a);
	}

}
