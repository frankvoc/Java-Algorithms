package Fibbonaci.src;

public class Main {
    public static void main(String[] args) {
        Recursive fib = new Recursive();
		int n = 7;
		int out = fib.Fib(n);
		System.out.println("Fib using recursive function:  " +  n  + " = " + out);
        System.out.println("\n");
        Iterative fibb = new Iterative();
        int n1 = 25;
        int outt = fibb.Fib(n1);
		System.out.println("Fib using iterative function:  " +  n1  + " = " + outt);
    }
}
