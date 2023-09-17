public class ArrayMinimum {
    public static void main(String[] args) {
        int[] array = new int[]{-4, -9, 5, 2, 0, 1, 7, 9, 6, 2};

        System.out.println(minimum(array));
    }

    private static int minimum(int[] array) {
        int min = -1; // if not positive elements found, the method will return -1

        // find the first positive number
        for (int x : array) {
            if (x >= 0) {
                min = x;
                break;
            }
        }
        // iterate using for each loop
        for ( int x : array) {

            //find a positive minimum
            if (x >= 0 && x <= min) {
                min = x;
            }
        }
        return min;
    }
}
