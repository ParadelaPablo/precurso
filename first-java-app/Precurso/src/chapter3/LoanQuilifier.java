package chapter3;

//If nested

import java.util.Scanner;

public class LoanQuilifier {

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
        if(salary >= requieredSalary){
            if(years >= requiredYears)
                System.out.println("You apply for the loan. Congratulations");
            else{
                System.out.println("Sorry, you need at least " + requiredYears + " yearfs in your current job");
            }
        }
        else{
            System.out.println("Sorry, you need to earn at least " + requieredSalary + " dollars as salary to apply to the loan");
        }

    }




}
