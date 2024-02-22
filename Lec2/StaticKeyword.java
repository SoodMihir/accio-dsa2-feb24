package Lec2;


class AccioStudent{
	String name;
	private int marks;
	private static String batch;
	static int noOfStudent;
	
	static class demo{
		int val;
		static void fun() {
			System.out.println("In static class:"+batch);
		}
		static void fun2() {
			
		}
	}
	
	static {
		System.out.println("In static block");
		batch = "DSA2";
		noOfStudent = 0;
	}
	
	AccioStudent() {
		noOfStudent++;
	}
	
	AccioStudent(String name, int marks){
		this();
		this.name =name;
		this.marks = marks;
	}
	
	public String toString() {
		return this.name+" "+this.batch+" "+this.marks;
	}
	
	public static String getBatch() {
		return batch;
	}
	public static int getTotalStudents() {
		getBatch();// can call other static methods
		// System.out.println(marks);// - non static variables cannot be accessed from static methods
//		this.batch; we cannot use this here
		
		return noOfStudent;
	}
	
	public int getMarks() {
		return this.marks;
	}
}
public class StaticKeyword {
	public static void main(String[] args) {
//		System.out.println("In main method");
		AccioStudent s1 = new AccioStudent("Akeeb", 90);
		AccioStudent s2 = new AccioStudent();
//		System.out.println(s1);
//		System.out.println(s1.getTotalStudents());
//		System.out.println(s2.batch);
//		System.out.println("------");
//		System.out.println(AccioStudent.batch);
//		System.out.println(AccioStudent.noOfStudent);
		
//		System.out.println(AccioStudent.getBatch());
//		System.out.println(AccioStudent.getTotalStudents());
//		System.out.println(s1.getMarks());
//		
//		
		System.out.println((new AccioStudent.demo()).val);
		
//		System.out.println(s1.batch);
//		System.out.println(s2.batch);
//		
//		s1.batch = "DSA3";
//		System.out.println();
//		
//		System.out.println(s1.batch);
//		System.out.println(s2.batch);
//		System.out.println(Car.noOfWheels); //-> present in a different package
		
		System.out.println(s1.getMarks());
		
	}

}
