package Two_Sum;

import java.util.Arrays;
//EZ
public class Main {
    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6};
        int target = 10;

        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }

    public static int[] findTwoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}