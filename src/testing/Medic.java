package testing;

public class Medic extends Officer{
    private static int id = 0;

    public Medic(int age, String name){
        super(age, name);

    }

    @Override
    public void attack() throws KillException{

        if(this.id < 5){throw new KillException("You are not allowed to shoot");}
        else {
            System.out.println("pop pop pop");
        }
    }

    @Override
    public void defend(){
        System.out.println("LOLO");
    }
}
