package fulopbence;

import java.lang.Math;
import java.util.Scanner;

public class Game {

    /*
    Game class.
    A random number is generated,
    then you can input your guess until
    you nail the random generated number.
     */

    public static void GameOn(){

        boolean win = false;
        int random = (int) (Math.random() * 10);
        System.out.println("I tought of a number between 0 and 10. \nCan You Guess It???\n");
        Scanner in = new Scanner(System.in);

        while(!win) {
            System.out.print("User guess: ");
            int guess = in.nextInt();
            if (guess == random) {
                System.out.println("You guessed it! It was " + random + "!");
                win = true;
            } else if (guess < random) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

    }

}
