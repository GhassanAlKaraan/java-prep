package exercices;

public class TripletSumZero {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -3, 0, -1, 2, -4, -1, 0, 1};

//        (-2) + 1 + 1 = 0
//        (-3) + 4 + (-1) = 0
//        2 + (-4) + 2 = 0

        findTriplets(array);

    }

    private static void findTriplets(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("Triplet :" + array[i] + ", " + array[j] + ", " + array[k]);
                    }
                }
            }
        }
    }
}
