package Revision_Exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Agency {

    private HashMap<String, HashSet<BabySitter>> map = new HashMap<>(); //k=region, v=set of babysitters

    public void hire(String name, int age, String area, HashSet<String> languages) {
        //Create BabySitter object
        BabySitter b = new BabySitter(name, age, area); //use constructor
        b.setLanguages(languages);//use setter for the set
        //Make the babysitters set
        HashSet<BabySitter> set = new HashSet<>();

        //search for the set by area
        if (this.map.containsKey(area)) {
            set = this.map.get(area);
        }

        set.add(b);//add the Babysitter to the set
        this.map.put(area, set);// add the set to the map.

    }//end of hire()

    public HashSet<BabySitter> findByLanguage(String language){
        HashSet<BabySitter> set = new HashSet<>(); //create a new set of babysitter to fill with results

        //I want to iterate through the values(sets) of a map without using the key area
        Iterator<HashSet<BabySitter>> it = this.map.values().iterator(); //Sets of BabySitters by Area
        while (it.hasNext()){
            HashSet<BabySitter> x = it.next(); //Take every set
            for (BabySitter b: x) { //Take every babysitter
                if(b.getLanguages().contains(language)){ //check for the matching language
                    set.add(b);
                }
            }
        }
        return set; // return set of babysitters
    }

    public TreeSet<BabySitter> findByArea(String area){
        HashSet<BabySitter> set = this.map.get(area);
        if(set == null){
            return null;
        }
        TreeSet<BabySitter> treeSet = new TreeSet<>(set);
        return treeSet;
    }

}
