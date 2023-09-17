package exercices;

public class reverseString {
    public static void main(String[] args) {

        String name = "Ghassan";
        String reversedName = reverse(name);

        System.out.println(reversedName);
    }

    private static String reverse(String name) {
        char[] arr = new char[name.length()];
        int j =0;
        for (int i = name.length() - 1; i >= 0; i--) {
            arr[j] = name.charAt(i);
            j++;
        }

        return new String(arr);
    }
}
