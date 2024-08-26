package chapter3;

import java.util.Scanner;
/*
 Everyone has 100 dollars a week, but people that exceds 10 sales get a bonus of 250.
*/

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]){

        //initialize known values
        int salary = 1000;
        int bonus = 250;

        //get values for the unknown
        System.out.println("How many sales did you this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > 10){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee´s pay is $ " + salary);
    }

}
