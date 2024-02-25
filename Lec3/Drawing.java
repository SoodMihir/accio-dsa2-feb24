package Lec3;

interface Drawing {
	String color = "Red";
	void draw();
//void drawShape() {
//	System.out.println("in fun");
//}
}

interface DrawShape extends Drawing{
	String tellShape();
}