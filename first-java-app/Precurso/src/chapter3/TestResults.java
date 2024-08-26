package chapter3;

import java.util.Scanner;

public interface TestResults {

    public static void main(String args[]){

        //Get the test score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();


        //Checkout
        if(score >= 7){
            System.out.println("You passed and you promoted");

        }
        else if (score >= 4){
            System.out.println("You passed, but you need to do a second exam");
        }
        else{
            System.out.println("You didn´t passed");
        }
    }





}
