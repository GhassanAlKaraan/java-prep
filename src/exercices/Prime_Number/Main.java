package Prime_Number;

public class Main {
    public static void main(String[] args) {

        int d = 70;
        System.out.println(isPrime(d));
    }
    private static boolean isPrime(int n){
        if(n<=0) return false;

        int x = 2;

        while(x*x <=n){
            if(n%x == 0) return false;
            x++;
        }
        return x*x > n;
    }

}
