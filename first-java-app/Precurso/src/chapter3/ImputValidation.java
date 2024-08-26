package chapter3;

import java.util.Scanner;

public class ImputValidation {

    public static void  main(String args[]){

        //Initialize
        int rate = 15;
        int maxHours = 40;


        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Count
        while(hoursWorked > maxHours){
        System.out.println("Invalid entry");
        hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //gross
        double salary = hoursWorked * rate;
        System.out.println("Your salary is: " + salary);




    }
}
