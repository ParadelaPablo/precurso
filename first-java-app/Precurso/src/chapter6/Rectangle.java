package chapter6;

import java.util.Scanner;

public class Rectangle {

    Scanner scanner = new Scanner(System.in);
    public class Rectangle {

        private double length;
        private double width;

        public Rectangle(){

            length = 0;
            width = 0;
        }
        public Rectangle(double length, double width){
            setLength(length);
            setWidth(width);
        }

       public double getLength {
            return length;


        }
       public void setLength(length) {
            this.length = length;


        }

            /*           System.out.println("Ingresar el length");

            double length = scanner.nextDouble();
                  System.out.println("Ingresar el width");
            double length = scanner.nextDouble();
*/

       public double getWidth{
            return getWidth;


        }

       public void setWidth (width) {
            this.width = width;

        }

       double calculateArea(){
           return (2*length) + (2*width);


        }

       double calculatePerimeter(){
           return length * width;



        }

    }
}
