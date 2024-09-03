package chapter5;

import java.util.Scanner;

public class Greetings {


    public static void main(String args[]){

    //preguntarle el nombre
    System.out.println("Dime tu nombre");
    Scanner scanner = new Scanner(System.in);
    String nombre = scanner.next();
    scanner.close();
    saludo(nombre);
    }

    //saludarlo
    public static String saludo(String nombre){
        String saludos = "Hola " + nombre + ". Un gusto";
        System.out.println(saludos);
        return (saludos);

    }


}
