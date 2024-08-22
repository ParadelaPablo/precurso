package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        //ask for a season
        System.out.println("Name a season: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //ask for a number
        System.out.println("Name a number: ");
        int coffes = scanner.nextInt();

        //ask for an adjective
        System.out.println("Name a adjective: ");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + coffes + " cups of coffee");

    }

}
