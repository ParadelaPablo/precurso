package chapter4;

import java.util.Random;


public class ActividadExtra {

    public static void main(String args[]) {

        int board = 20;
        int dicesRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        System.out.println("Welcome to play. Are you ready?...");


        //mensaje para el usuario
        //
        for (int i = 1; i <= dicesRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == board) {
                System.out.println("Amazing! You won!");
                break;
            } else if (currentSpace > board) {
                System.out.println("So bad. Te pasaste");
                break;
            } else if (currentSpace < board && i == dicesRolls) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + board + " spaces. You lose!");
            } else {
                int spacesToGo = board - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();


        /*The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board. Here’s the code to do this
;
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

Repeat this 4 additional times, for 5 rolls in total.

However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

If they are greater than or less than 20 spaces exactly, they lose.

Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.*/


        }


    }
}