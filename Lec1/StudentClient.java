package Lec1;

public class StudentClient {

	public static void main(String[] args) {

		System.out.println("Before Swap");
		Student s1 = new Student(20, "Rahul");
		
		Student s2 = new Student(21, "Rohan");
		s1.print();
		s2.print();
		
		swap(s1,s2);
		
		System.out.println("AfterSwap");
		s1.print();
		s2.print();
		
	}
	static void swap(Student s1, Student s2) {
		// this will not work as we are only swapping the reference
//		Student temp = s1;
//		s1 = s2;
//		s2 = temp;
		
		Student temp = new Student();
		
		temp.name = s1.name;
		s1.name = s2.name;
		s2.name = temp.name;
		
		temp.age = s1.age;
		s1.age = s2.age;
		s2.age = temp.age;
	}

}
