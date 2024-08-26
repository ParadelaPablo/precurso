package chapter3;

//If else


import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("How many sales did you this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if(sales >= quota){
            System.out.println("Congratulations");
        }
        else{
            System.out.println("This week you sold only " + sales + " units. You can do it better");

        }


    }

}
