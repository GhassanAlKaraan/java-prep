package Factorial;

public class Main {
    public static void main(String[] args) {
        int x = -4;

        System.out.println(factorial(x));
    }

    private static int factorial(int x) {
        if(x <0) return -1;
        if(x <=1) return 1;

        return x * factorial(x-1);
    }
}
