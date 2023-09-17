package exercices;


import java.util.HashMap;

public class StrDuplicates2 {
    public static void main(String[] args) {
        String[] array = new String[] {"et", "gAs", "x","11","x1", "X1", "x2", "x3"};

        System.out.println(stringDup(array));
    }

    private static String stringDup(String[] array) {
        int len = array.length;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <len; i++) {
            if(!map.containsKey(array[i].toUpperCase())){
                map.put(array[i].toUpperCase(), 1);
            }else{
                return array[i];
            }
        }
        return "";
    }
}
