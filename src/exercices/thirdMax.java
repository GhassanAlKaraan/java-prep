package exercices;

public class thirdMax {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9};

        thirdMax(array);
    }
    private static void thirdMax(int[] array){
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;


        for (int i=0; i< array.length; i++){
            if(array[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2 && array[i] < max1) {
                max3 = max2;
                max2 = array[i];
            } else if (array[i] > max3 && array[i] < max2) {
                max3 = array[i];
            }
        }
        System.out.println("MAX1: "+max1+", MAX2: "+max2+", MAX3: "+max3);
    }
//
//    private static void find3rdMax(int[] array) {
//        int max1 = -1;
//        int max2 = -1;
//        int max3 = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max1) {
//                max1 = array[i];
//            }
//        }
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] > max2 && array[j] < max1) {
//                max2 = array[j];
//            }
//        }
//        for (int k = 0; k < array.length; k++) {
//            if (array[k] > max3 && array[k] < max2) {
//                max3 = array[k];
//            }
//        }

//        System.out.println("MAX1: " + max1 + ", MAX2: " + max2 + ", MAX3: " + max3);
//    }
}
