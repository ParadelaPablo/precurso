package chapter3;

import java.util.Scanner;

public class ImputValidationDoWhile {

    public static void  main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;
        do{
            System.out.println("Write a number");
            double num1 = scanner.nextDouble();

            System.out.println("Write the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " +  sum);

            System.out.println("Do would like to do it again?");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();

    }
}
