package Reverse_Vowels_of_a_String;

// Work with String & Characters:
// ==============================
// Convert to char array
// char[] arr = myStr.toCharArray();

// Convert back to String
// new String(arr);


// Work with 2 pointers:
// ==============================
// Use while(left<right)
// Use nested if(s)
// move the 2 indexes

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String str = "hello world";

        System.out.println(reverseVowels(str));
    }
    private static String reverseVowels(String str){
        int len = str.length();
        char[] arr = str.toCharArray();

        List<Character> vowels = new ArrayList<>();

        vowels.add('A'); vowels.add('a');
        vowels.add('E'); vowels.add('e');
        vowels.add('O'); vowels.add('o');
        vowels.add('U'); vowels.add('u');
        vowels.add('I'); vowels.add('i');


        int left = 0;
        int right = len-1;

        while(left<right){

            if(vowels.contains(arr[left])){

                if(vowels.contains(arr[right])){

                    //SWAP
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    right--;
                    left++;
                }
                else{
                    right--;
                }
            }else {
                left++;
            }
        }

        return new String(arr);
    }
}
