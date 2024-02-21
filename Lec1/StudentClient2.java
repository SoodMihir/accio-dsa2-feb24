package Lec1;

public class StudentClient2 {

	public static void main(String[] args) {
//		Student s1 = new Student(15, "Virat");
//		s1.print();
//		
//		Student s2 = s1;
//		s2.print();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		s2.name = "Dhoni";
//		
//		System.out.println("------");
//		s1.print();
//		s2.print();
		
		Student s1 = new Student(15, "Virat");
		s1.print();
		
		Student s2 = new Student(s1);
		s2.print();
		s2.name = "Dhoni";
		
		System.out.println("------");
		s1.print();
		s2.print();
		
	}

}
