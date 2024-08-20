package Fibbonaci.src;

public class Iterative {
	public int Fib(int n1) 
	{
		 if (n1 <= 1) {
	            return n1;
	        }
	        
	        int num1 = 0, num2 = 1;
	        
	        for (int i = 2; i <= n1; i++) {
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	        }
	        
	        return num2;
    }
}

