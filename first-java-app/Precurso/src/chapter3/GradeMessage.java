package chapter3;

import java.util.Scanner;

public class GradeMessage {

        public static void main(String args[]){

            //Get the test score
            System.out.println("Enter your letter grade");
            Scanner scanner = new Scanner(System.in);
            String grade = scanner.next();

            String message;

            switch(grade){
                case "A":
                    message = "Excelent job";
                    break;
                case "B":
                    message = "Good job";
                    break;
                case "C":
                    message = "Ok job";
                    break;
                case "D":
                    message = "Not so good job";
                    break;
                case "E":
                    message = "Bad job";
                    break;
                default:
                    message = "Error. Invalid grade";
                    break;
            }
        System.out.println(message);

    }


}
