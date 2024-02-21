package Lec1;

public class Student {
	// data members
	int age;
	String name;
	
	// default constructor
	Student(){
		System.out.println("In default constructor");
	}
	
	// parameterised constructor
	Student(int age, String name){
		this(name);			
		System.out.println("In parameterised constructor-2");
		this.age = age;
	}
	
	Student(String name){
		this(); // calls the default constructor
		System.out.println("In parameterised constructor-1");
		
		this.name = name;
	}
	
	// copy constructor
	Student(Student s){
		this.age = s.age;
		this.name = s.name;
	}
	
	// data functions
	public void print() {
		System.out.println("Name:"+this.name+":Age:"+this.age);
	}
	
	@Override
	public String toString() {
		return this.name+" is "+this.age+" years old.";
	}
}