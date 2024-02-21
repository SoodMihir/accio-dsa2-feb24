package Lec1;

public class test {

	public static void main(String[] args) {
//		fun(80);
		System.out.println(factorial_recursive(5));

		
	}
	public static long factorial_recursive(int n) {
        // base condition
        if(n==1){
            return 1L;
        }

        long sp = factorial_recursive(n-1);
        long sw = n * sp;
        return sw;
    }
	
	public static void fun(int x) {
		if(x==0) {
			return;
		}
		System.out.println("In fun "+x);
		fun(x/2);
	}
}



/*
	1 2 3 4 5
	
	
	
	print(4){
		if 4<=0 return -
	
	print(3) - 
	
	syso(4) - 
	}
	
	print(5){
	if 5<=0 return -
	
	print(4) -
	
	syso(5) - 
	}
*/