package exercices;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    private static boolean isHappy(int n) {
        int result = n;

        while (result != 1) {
            String str = String.valueOf(result);
            if (str.length() <= 1 && result > 1)
                return false;
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Math.pow(Character.getNumericValue(str.charAt(i)), 2);
            }
            result = sum;
        }
        return true;
    }

}
