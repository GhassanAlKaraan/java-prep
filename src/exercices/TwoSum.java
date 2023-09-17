package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 11, 7, 15};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your target to find in Array: " + Arrays.toString(array));
        System.out.print("Target: ");
        int target = scan.nextInt();

        System.out.println("Answer is: " + Arrays.toString(findTwoSum(array, target)));

        scan.close();
    }

    private static int[] findTwoSum(int[] array, int target) {
        int[] newArray = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }

        return newArray;
    }
}
