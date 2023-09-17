package testing;

public abstract class Officer implements Actions{

    private int age;
    private String name;
    private static int counter = 0;

    public Officer(int age, String name){
        this.age = age;
        this.name = name;
        counter++;
    }

    // Getters
    public int getAge(){return this.age;}
    public String getName(){return this.name;}

    // Setters
    public void setAge(int age){this.age = age;}
    public void setName(String name) {this.name = name;}


    // Methods
    public abstract void attack() throws KillException;




    @Override
    public String toString() {
        return "Officer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void defend(){
    }


}
