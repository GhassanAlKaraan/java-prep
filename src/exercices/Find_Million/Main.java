package Find_Million;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 0, 4, 100, 8, -5, 6, -7, 5, 3, 8, 32, 1, 7, 5, 1000, 8};

        System.out.println(Arrays.toString(findMillion(arr)));
    }
    private static int[] findMillion(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]*arr[j] == 1_000_000){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}