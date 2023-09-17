package ArrayMinimum;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,-8,3,0,4,9,-2};

        int len = arr.length;
        int min = arr[0];


        //Find a positive number to start with
        for (int i = 0; i < len; i++) {
            if(arr[i]>=0) {
                min = arr[i];
                break;
            }
        }

        //Find the smallest positive number
        for (int i = 0; i < len; i++) {
            if(arr[i]>=0 && min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
