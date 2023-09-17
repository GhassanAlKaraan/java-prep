package Fibonacci;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(fib(x));
    }
    private static int fib(int n){
        if(n==0) return 0;

        return n+fib(n-1);
    }
}
