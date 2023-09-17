package exercices;

public class MaximumArray {
    public static void main(String[] args) {
//        int[] array = new int[]{1};
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(findSub(array));
    }

    private static int findSub(int[] nums) {


        int sum = nums[0];
        int max = nums[0];
        for (int index = 0; index < nums.length - 1; index++) {
            for (int i = 1; i < nums.length; i++) {
                for (int j = index; j <= i; j++) { //this for-loop is to get Sum
                    sum += nums[j];
                }
                if (sum > max) max = sum;
                sum = 0;
            }
        }
        return max;
    }
}
// BEST SOLUTION... WTF
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int sum = 0 , maxi = Integer.MIN_VALUE;
//
//        for(int j=0; j<nums.length; j++){
//            if(sum < 0){
//                sum = 0;
//            }
//            sum += nums[j]; //do the sum looping j:0->arr.lenth
//            if (maxi < sum) maxi = sum; //get the max sum with every iteration
//        } //end of for
//        return maxi;
//    }
//}

