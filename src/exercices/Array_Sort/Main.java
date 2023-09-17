package Array_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{6,0,4,0,8,-5,6,-7,5,3,8,32,1,7,5,1,8};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) { //this is just to iterate "len" times
            for(int j=0; j<len-i-1; j++){ //this is to check elem by elem
                //while stacking the sorted ints at the end
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
