package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Saveable saad = new Sample("saad" , 20238763, "Senior");
        System.out.println(saad);
        savedObject(saad);
        loadObject(saad);
        System.out.println("After loading...");
        System.out.println(saad);

        Saveable derekson = new Employee("Derek" , "Secretary", "Administration");
        System.out.println(derekson);
        savedObject(derekson);

        loadObject(derekson);
        System.out.println("After loading...");
        System.out.println(derekson);

    }

public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scan  = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a String\n"+
                "0 to quit");
        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 0:
                    quit= true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String output = scan.nextLine();
                    values.add(index, output);
                    index++;
                    break;
            }
        }
        return values;
        }

        public static void savedObject(Saveable save){
        for(int i = 0; i< save.write().size(); i++){
            System.out.println("Saving object: "+ save.write().get(i)+" to the device.");
            }
        }

        public static void loadObject(Saveable load){
        ArrayList<String> values = readValues();
        load.read(values);
        }


}

