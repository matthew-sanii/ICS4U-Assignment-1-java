/*
* This is a program that randomly gives marks
* to assignments in an array.
*
* @author  Matthew Sanii
* @version 1.0
* @since   2021-26-11
*/

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
* This is the marks program.
*/
final class RPS {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RPS() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Creates the marks for the generate program to use.
    *
    * @return the mark generated
    */
    public static String opponentChoice() {
        final Random random = new Random();
        final int min = 1;
        final int max = 3;
        String option = "";
        final int random_choice = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_choice);
        if (random_choice == 1) {
            option = "rock";
        } else if (random_choice == 2) {
            option = "paper";
        } else {
            option = "scissors";
        }
        return option;
    }

    public static String compare(String player, String computer) {
        

    }





    public static void main(final String[] args) {
        final Scanner decision = new Scanner(System.in);
        while (true) {
            String rock = "rock";
            String paper = "paper";
            String scissors = "scissors";
            String failure = "You lose!";
            System.out.print("Rock, Paper, or Scissors? ");
            String playerChoice = decision.nextLine();
            String computerChoice = opponentChoice();
            System.out.println(computerChoice);
            if (playerChoice.toLowerCase() == computerChoice) {
                System.out.println("Tie!");
            } else if (playerChoice.toLowerCase().equals(rock) && computerChoice.equals(paper)) {
                System.out.println(failure);
                
            } else if (playerChoice.toLowerCase().equals(paper) && computerChoice.equals(scissors)) {
                System.out.println(failure);
                
            } else if (playerChoice.toLowerCase().equals(scissors) && computerChoice.equals(rock)) {
                System.out.println(failure);
                
            } else {
                System.out.println("You win!");
                
            }
            
}
}


}
}
