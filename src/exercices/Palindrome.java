public class Palindrome {

    public static void main(String[] args) {
        int x = -23432;
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if(str.charAt(i) != str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
