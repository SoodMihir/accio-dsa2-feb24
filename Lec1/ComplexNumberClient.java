package Lec1;

public class ComplexNumberClient {
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber(5,10);
		cn1.print();
		System.out.println(cn1);
		ComplexNumber cn2 = new ComplexNumber(15,-11);
		cn2.print();
		
		ComplexNumber cn3 = cn1.add(cn2);
		cn3.print();
		
//		
//		ComplexNumber cn4 = cn1.subtract(cn2);
//		cn4.print();
//		
//		ComplexNumber cn5 = cn1.add(cn2,cn4);
	}
}
