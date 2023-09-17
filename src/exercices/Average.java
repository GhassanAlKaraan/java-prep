package exercices;

public class Average {
    public static void main(String[] args) {
        int[] array = new int[]{-4, -9, 5, 2, 0, 1, 7, 9, 6, 2};

        System.out.println(average(array));
    }

    private static double average(int[] array){
        int counter = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                sum += array[i];
                counter++;
            }
        }
        return sum/counter;
    }
}
