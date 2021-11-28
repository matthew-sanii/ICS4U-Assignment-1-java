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
        if (random_choice == 1) {
            option = "rock";
        } else if (random_choice == 2) {
            option = "paper";
        } else {
            option = "scissors";
        }
        return option;
    }

    public static int compare(String player, String computer) {
        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";
        final String failure = "You lose!";
        int result = 0;
        if (player.equals(computer)) {
            System.out.println("Tie!");
        } else if (player.equals(rock) && computer.equals(paper)) {
            System.out.println(failure);
            result += 1;
        } else if (player.equals(paper) && computer.equals(scissors)) {
            System.out.println(failure);
            result += 1;
        } else if (player.equals(scissors) && computer.equals(rock)) {
            System.out.println(failure);
            result += 1;
        } else {
            System.out.println("You win!");
            result += 1;
        }
        return result;
    }

    public static void main(final String[] args) {
        final Scanner decision = new Scanner(System.in);
        int versus = 0;
        while (versus == 0) {
            System.out.print("Rock, Paper, or Scissors? ");
            String playerChoice = decision.nextLine();
            playerChoice = playerChoice.toLowerCase();
            String computerChoice = opponentChoice();
            System.out.println("Computer chose " + computerChoice + ".");
            versus = compare(playerChoice, computerChoice);
        }
        System.out.println("\nDone.");
    }
}
