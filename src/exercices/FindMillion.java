package exercices;

public class FindMillion {
    public static void main(String[] args) {
        int[] arr = {1000, 1000, 100, 10000};

    findAnswer(arr);
    }
    private static void findAnswer(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]*array[j] == 1_000_000){
                    System.out.println("Answer: "+ array[i]+", "+array[j]);
                }
            }
        }
    }
}
