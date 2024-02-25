package Lec3;

class Circle implements Drawing{
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}
class Rectangle implements Drawing{
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

class Triangle implements DrawShape{

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}

	@Override
	public String tellShape() {
		return "Triangle";
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println(Drawing.color);
		Drawing d = new Circle();
		d.draw();
		Drawing d2 = new Rectangle();
		d2.draw();
		
//		Triangle t = new Triangle();
		DrawShape d3 = new Triangle();
		System.out.println(d3.tellShape());
	}

}
