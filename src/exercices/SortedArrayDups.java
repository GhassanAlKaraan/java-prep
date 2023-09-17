package exercices;

import java.util.ArrayList;

public class SortedArrayDups {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};
        System.out.println(removeDups(array));;
    }

//    private static void removeDups(int[] array) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int tmp = array[0];
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//                tmp = array[i + 1];
//            } else {
//                arrayList.add(tmp);
//                tmp = array[i + 1];
//            }
//
//        }
//        arrayList.add(tmp);
//        System.out.println(arrayList);
//    }
    private static int removeDups(int[] nums){
        int index=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
            }
        }
        for (int i = index +1; i < nums.length; i++) {
            nums[i] = -1;
        }
        return index+1;
    }
}
