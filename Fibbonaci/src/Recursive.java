package Fibbonaci.src;

public class Recursive {
	public int Fib(int n) {
		if(n<=1) {
			return n;
		}
		return Fib(n - 1) + Fib(n - 2);
	}
}
