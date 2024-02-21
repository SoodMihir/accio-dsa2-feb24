package Lec1;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
//		int a = 10;
		Integer a = new Integer(10);
		System.out.println(a);
		// Conversion of primitive into Wrapper class -> Boxing/Wrapping
		System.out.println(a.getClass());
	
		
		int b = a.intValue();
		System.out.println("b is "+b );
		// Conversion of wrapper class to primitive -> Unwrapping/Unboxing
		
//		Long
//		Boolean
//		Short
//		Byte
//		Character
//		Float
//		Double
		
		Integer c = 4; // auto-boxing
		System.out.println(c);
		
		int d = c; // auto-unboxing
		System.out.println(d);
		
		System.out.println(Integer.MAX_VALUE);
		
//		ArrayList<Integer> al;
	}
	

}
