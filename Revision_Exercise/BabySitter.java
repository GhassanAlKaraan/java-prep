package Revision_Exercise;

import java.util.HashSet;

public class BabySitter implements Comparable<BabySitter>{
    private String name;
    private int age;
    private String area;
    private HashSet<String> languages;
    private boolean busy = false;


    public BabySitter(String name, int age, String area) {
        this.name = name;
        this.age = age;
        this.area = area;
        this.languages = new HashSet<String>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public HashSet<String> getLanguages() {
        return languages;
    }
    public void setLanguages(HashSet<String> languages) {
        this.languages = languages;
    }


    public void book() throws Exception {
        if(this.busy == true){
            throw new Exception("BabySitter is Busy");
        }else{
            this.busy = true;
            System.out.println("Successfully Booked "+ this.toString());
        }
    }

    @Override
    public String toString() {
        return "BabySitter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", area='" + area + '\'' +
                ", languages=" + languages +
                '}';
    }



    @Override
    public int compareTo(BabySitter o) {
        return this.getName().compareTo(o.getName()); //used in String Class.
    }
}
