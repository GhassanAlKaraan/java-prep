package exercices;

import java.util.ArrayList;
import java.util.HashMap;

class ReverseVowels {

    public static void main(String[] args) {
        String str = "hello world kifak?";
        System.out.println(reverseVowels(str));
    }


    private static String reverseVowels(String s) {
        // Create a list of vowels
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // Convert the string to a char array
        char[] charArray = s.toCharArray();

        int counter =0;
        // Initialize left and right pointers
        int left = 0;
        int right = charArray.length - 1;

        while(left<right){
            if(vowels.contains(charArray[left])){
                if(vowels.contains(charArray[right])){
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    right--;
                    left++;
                }else{
                    right--;
                }
            }else{
                left++;
            }
            counter++;
            System.out.println("trying: "+counter+" left: "+left+", right: "+right);

        }


        // Loop until left and right pointers meet
//        while (left < right) {
//            // Check if the left character is a vowel
//            while (left < right && !vowels.contains(charArray[left])) {
//                left++;
//            }
//
//            // Check if the right character is a vowel
//            while (left < right && !vowels.contains(charArray[right])) {
//                right--;
//            }
//
//            // Swap the characters if both are vowels
//            if (left < right) {
//                char temp = charArray[left];
//                charArray[left] = charArray[right];
//                charArray[right] = temp;
//            }
//
//            // Increment left pointer
//            left++;
//
//            // Decrement right pointer
//            right--;
//        }

        // Return the new string
        return new String(charArray);
    }


}
