package chapter6;

import java.util.Scanner;

public class HomeAreaCalculator {

    public static void main (String args[]){


        //Rectángulo 1
        Rectangle room1 = new Rectangle();
        room1.setLength(35);
        room1.setWidth(46);
        double areaOfTheRoom1 = room1.calculateArea();
        double PerimeterOfTheRoom1 = room1.calculatePerimeter();

        //Rectángulo 2
        Rectangle room2 = new Rectangle(45,54);
        double areaOfTheRoom2 = room2.calculateArea();
        double PerimeterOfTheRoom2 = room2.calculatePerimeter();

        double totalArea = areaOfTheRoom1 + areaOfTheRoom2;

        System.out.println("El area total es: " + totalArea);
        Scanner scanner = new Scanner(System.in);
        scanner.close();


    }

}
