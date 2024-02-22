package Lec2;

class Employee {
	int salary = 10000;
	String name;
	protected int id = 1234;

	Employee(String name, int sal) {
		this.name = name;
		this.salary = sal;
	}

	int getSal() {
		return this.salary;
	}
}

class SDE extends Employee {
	int bonus = 2000;

	SDE(String name, int sal, int bonus) {
		super(name, sal);
		this.bonus = bonus;
	}

	@Override
	int getSal() {
		return 1000 + this.bonus;
	}

}

public class InheritenceDemo {

	public static void main(String[] args) {
		SDE sde1 = new SDE("Laksh", 100000, 1000);

		System.out.println(sde1.getSal());
	}

}
