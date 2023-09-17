package exercices;

public class BuySellStock {
    public static void main(String[] args) {
        int[] array = new int[]{7, 1, 5, 3, 9, 10};

        System.out.println(findBestProfit(array));
    }

    private static int findBestProfit(int[] array) {
        int profit = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // int x = array[j] - array[i]
                //x must be the best between all Xs in the same iteration
                //then compare all the Xs between all iteration
                int difference = array[j] - array[i];
                if (difference > profit) {
                    profit = difference;
                }
            }
        }

        return profit;
    }

}
