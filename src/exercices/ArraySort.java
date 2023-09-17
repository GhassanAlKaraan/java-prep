public class ArraySort {
    public static void main(String[] args) {

        int[] array = new int[]{1,6,2,6,3,5,8,9,4,6,7,9};

        //System.out.println(Arrays.toString(bubbleSort(array)));
        bubbleSort(array);

        for(int x : array){
            System.out.print(x + ", ");
        }
    }
    private static void bubbleSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            //outer loop to reach the last element
            for (int j = 0; j < array.length - i-1; j++) {
                //3atoul la abel e5er element mnousal bl j [tzakkar el j+1]
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
