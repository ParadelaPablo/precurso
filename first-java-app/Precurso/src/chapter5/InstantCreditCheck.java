package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredScore = 700;

    public static void main(String args[]) {



        double salary = getSalary();
        int score = getScore();
        boolean isQualified = qualified(score, salary);

        if (isQualified){

            System.out.println("Felicidades, aprobaste");
        }
        else{
            System.out.println("Qué mal, no aprobaste");

        }

    }

    public static double getSalary() {
        System.out.println("Ingresa el salario");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        return salary;
    }


    public static int getScore() {
        System.out.println("Ingresa el score");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();
        return score;
    }

    //Check if the user is qualified
    public static boolean qualified(int score, double salary) {

        if (score >= requiredScore && salary >= requiredSalary) {
            return true;
        }
        else {
            return false;
        }
    }





}