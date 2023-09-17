package testing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Medic medic = new Medic(26,"John");
        try{
            medic.attack();
        }catch (KillException e){
            e.printStackTrace();
        }
    }
}
