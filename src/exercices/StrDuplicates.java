package exercices;

public class StrDuplicates {

    public static void main(String[] args) {
        String[] array = new String[] {"et", "gas", "x","11","x1", "x1", "x2", "x3"};

        System.out.println(stringDup(array));
    }

    private static boolean stringDup(String[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].toUpperCase().equals(array[j].toUpperCase())){
                    return true;
                }
            }
        }
        return false;
    }
}
