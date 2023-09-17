package Reverse_String;

import java.util.Scanner;

// Work with String and array
// loop from =0 to <len/2
// Swap characters inside the char array

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your target string to reverse: ");
        String str = scan.nextLine();

        System.out.println("Target: "+ str);
        System.out.println("Reversed: "+ reverseString(str));
        System.out.println("Reversed again: "+ reverseString(reverseString(str)));
    }
    private static String reverseString(String str){
        char[] arr= str.toCharArray();

        for(int i=0; i<arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }


        return new String(arr);
    }
}
