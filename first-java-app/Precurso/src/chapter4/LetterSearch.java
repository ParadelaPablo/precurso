package chapter4;

import java.util.Locale;
import java.util.Scanner;

public class LetterSearch {


    public static void main (String args[]){



        //Get text
        System.out.println("Esta es la frase");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
       for (int i = 0; i < text.length(); i++) {
           char currentLetter = text.charAt(i);
           if (currentLetter == 'a') {
               letterFound = true;
               break;
           }

       }
       if(letterFound){
            System.out.println("El texto contiene la letra a");
        }
        else{
            System.out.println("El texto no contiene la letra a");

            }


        }

    }

