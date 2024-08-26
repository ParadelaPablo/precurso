package chapter3;

//If nested

import java.util.Scanner;

public class LogicLoanQuilifier {

    public static void main(String args[]){

    //Initialize
    int requieredSalary = 30000;
    int requiredYears = 2;

    //Get what we don´t
    System.out.println("Enter your salary");
    Scanner scanner = new Scanner(System.in);
    double salary = scanner.nextDouble();

    System.out.println("Enter de number of years with your current employer");
    double years = scanner.nextDouble();

    scanner.close();

    //Make decision
        if(salary >= requieredSalary && years >= requiredYears){
            System.out.println("You apply for the loan. Congratulations");

        }
        else{
            System.out.println("Sorry, you need to earn at least " + requieredSalary + " dollars as salary and have more than " + requiredYears + " at your current job to apply to the loan");
        }

    }




}
