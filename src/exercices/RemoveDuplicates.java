package exercices;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,1,3,4,2,5,6,7};
        removeDup(array);
    }
    private static void removeDup(int[] array){
        HashSet<Integer> set = new HashSet<>();

        for (int i : array) set.add(i);

        int index = 0;
        for (int j : set) {array[index]=j; index++;}

        System.out.println(Arrays.toString(array));
    }


}
