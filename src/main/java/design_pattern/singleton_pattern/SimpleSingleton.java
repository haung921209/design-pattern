package design_pattern.singleton_pattern;

import design_pattern.singleton_pattern.domain.model.field.BasicField;
import design_pattern.singleton_pattern.domain.model.maincharacter.MainCharacter;

import java.util.Scanner;

public class SimpleSingleton {
    public static void main(String[] args) {
        BasicField basicField = new BasicField();

        System.out.println("Hello from here!");
        System.out.println("Please choose operation which you want to");
        System.out.println("1. Start game | 2. Exit");
        Scanner scan = new Scanner(System.in);

        int myInt = scan.nextInt();
        boolean flag = myInt == 1 ? true : false;

        while(flag){
            MainCharacter mainCharacter = MainCharacter.getInstance();
            System.out.println("Welcome! What's your name?");

            String name = scan.next();
            mainCharacter.setName(name);
            mainCharacter.setBasicStatus();
            mainCharacter.setAlive();

            basicField.huntGoblin();
            basicField.huntDragon();

            if(!mainCharacter.isAlive()){
                System.out.println("Game over");
                flag = false;
            }

            System.out.println("Continue?");

            System.out.println("1. Continue | 2. Exit");
            myInt = scan.nextInt();

            if(myInt == 1){
                flag = false;
            }
            else{
                flag = true;
            }
        }

        System.out.println("Goodbye!");
    }

}
