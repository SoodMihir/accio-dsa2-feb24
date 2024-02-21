package Lec1;

public class StudentConstructorChaining {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		
		System.out.println("------");
		Student s2 = new Student("Rakesh");
		s2.print();
		
		System.out.println("------");
		Student s3 = new Student(20,"Mukesh");
		s3.print();
		
	}

}
