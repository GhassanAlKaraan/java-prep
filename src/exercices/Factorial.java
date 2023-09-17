public class Factorial {
    public static void main (String[] args){

        int x = 4;
        System.out.println(factorial(x));

    }

    private static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
