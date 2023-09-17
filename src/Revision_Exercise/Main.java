package Revision_Exercise;

/*
Parents --> Agency --> BabySitter

BabySitter:
-name
-age
-set of Languages
-status: FREE/BUSY

Agency:
private Map<BabySitter, Region>
-bookBabySitter(...area...or some info) -->BabySitter.status = BUSY. throws alreadyBusy Exception
-retrieve BabySitters who speak ... Language
-retrieve a treeset(by names) of Babysitters who live in ... region

Main:
Create an empty Agency
read BabySitters info from file given as argument
let user input the area, and let him book a Babysitter from his area

File must be updated with the status of the babysitters
*/

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Agency agency = new Agency();

        File source = new File("C:\\Users\\ghass\\Desktop\\My Files\\Java\\Basic Java\\Basics\\src\\ch9_collections\\Revision_Exercise\\source.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(source)); // or use args[0]
            String line;
            while((line = reader.readLine())!= null){
                String[] info = line.split("-");
                String[] lang = info[3].split(" ");
                agency.hire(info[0], Integer.parseInt(info[1]), info[2], new HashSet<>(Arrays.asList(lang)));
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your area: ");
            String area = scanner.nextLine();
            TreeSet<BabySitter> treeSet = agency.findByArea(area);
            if (treeSet == null){
                System.out.println("No Baby Sitters available in this area");
                System.exit(0);
            }
            for (BabySitter b: treeSet) {
                try{
                    b.book();
                    break; // Stop when you find a free Baby Sitter
                }catch (Exception e){
                    e.getMessage();
                }
            }

//            System.out.println("Please enter preferred language: ");
//            String language = scanner.nextLine();
//            System.out.println(agency.findByLanguage(language));

        } catch (FileNotFoundException e) {
            // Handle the exception appropriately
            e.printStackTrace();
        } catch (IOException e) {
            // Handle the exception appropriately
            e.printStackTrace();
        }

    }
}
