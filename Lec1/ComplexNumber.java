package Lec1;

public class ComplexNumber {
	int real;
	int imaginary;
	
	ComplexNumber() {
		this.real = 0;
		this.imaginary = 0;
	}
	ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void print(){
		System.out.println(this);
		if(this.imaginary>=0) {
			System.out.println(this.real+"+"+this.imaginary+"i");
		}else {
			System.out.println(this.real+""+this.imaginary+"i");
		}
	}
	
	// adds a complex number to the current number and return the result
	ComplexNumber add(ComplexNumber cn) {
		int realPart = this.real + cn.real;
		int imPart = this.imaginary + cn.imaginary;
		return new ComplexNumber(realPart, imPart);
	}
	
//	int add(int a, int b) {
//		return a+b;
//	}

	
	// subtract a complex number to the current number and return the result
		ComplexNumber subtract(ComplexNumber cn) {
			int realPart = this.real - cn.real;
			int imPart = this.imaginary - cn.imaginary;
			return new ComplexNumber(realPart, imPart);
		}
	
}
