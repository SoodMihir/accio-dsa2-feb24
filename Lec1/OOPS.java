package Lec1;

import java.util.ArrayList;

public class OOPS {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Kartik";
		s1.age = 20;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		Student s2 = new Student();
		s2.name = "Mihir";
		s2.age = 24;
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.name);
//		System.out.println(s2.name);
		
		
//		System.out.println(s1.name + " "+s1.age);
//		System.out.println(s2.name + " "+s2.age);
		
		
	}

}
