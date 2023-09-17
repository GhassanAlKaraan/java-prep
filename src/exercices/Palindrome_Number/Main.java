package Palindrome_Number;

public class Main {
    public static void main(String[] args) {
        int x = 1234321;
        int y = 12340321;
        boolean b = true;
        String str = String.valueOf(x);
        int len = str.length();
        for(int i=0; i<len/2; i++){
            System.out.println("i: "+i+", char: "+ str.charAt(i));
            if(str.charAt(i) != str.charAt(len-i-1)){
                b = false;
            }
        }
        System.out.println(b);
    }
}
