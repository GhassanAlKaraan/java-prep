package Remove_Element;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr=  new int[]{1,2,3,4,5,6};

        removeElement(arr, 3);

        System.out.println(Arrays.toString(arr));
    }

    private static void removeElement(int[] nums, int val){
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }

        }
    }
}
