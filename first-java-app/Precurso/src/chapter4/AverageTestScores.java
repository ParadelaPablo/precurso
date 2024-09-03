package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main (String args[]){

        int students = 24;
        int tests = 4;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

      //ingresar los números de los test de cada alumno
      for(int i=0; i<students; i++){
        for(int j=0; j<tests; j++) {
            System.out.println("Ingresar el resultado de la prueba " + (j+1));

            total = total + scanner.nextInt();

        }
          //sacar el promedio
          double average = (double) total / tests;
          System.out.println("El promedio del estudiante  " + (i+1) + " es " + average);



      }

        scanner.close();




    }

}
