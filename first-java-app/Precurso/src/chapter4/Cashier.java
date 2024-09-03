package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        //get a number of items to scan
        System.out.println("Ingresá número de productos a scanear");
        double productos = scanner.nextDouble();


        double total = 0;

        //create a loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<productos; i++){


            System.out.println("Ingresar el precio del producto");
            double precio = scanner.nextDouble();
            total = precio + total;

        }
        System.out.println(total);

        scanner.close();

    }
}
