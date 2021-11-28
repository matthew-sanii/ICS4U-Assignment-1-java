/*
* The Rock Paper Scissors program that makes you play
* Rock Paper Scissors with a computer.
*
* @author  Matthew Sanii
* @version 1.0
* @since   2021-26-11
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the rock paper scissors program.
*/
final class RockPaperScissors {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Randomly chooses what the computer will use in Rock Paper Scissors.
    *
    * @param rock The rock string
    * @param paper The paper string
    * @param scissors The scissors string
    *
    * @return the computer's choice
    */
    public static String opponentChoice(String rock, String paper, String scissors) {
        final Random random = new Random();
        final int min = 1;
        final int max = 3;
        String option = "";
        final int randomChoice = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (randomChoice == 1) {
            option = rock;
        } else if (randomChoice == 2) {
            option = paper;
        } else {
            option = scissors;
        }
        return option;
    }

    /**
    * The compare function that compares the user and computer's choices.
    *
    * @param player The player's input
    * @param computer The computer's input
    * @param rock The rock string
    * @param paper The paper string
    * @param scissors The scissors string
    *
    * @return Who wins the round
    */
    public static int compare(String player, String computer, String rock,
                                            String paper, String scissors) {
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

    /**
    * The starting main() function.
    *
    * @param args Name of file containing a string of numbers
    */
    public static void main(final String[] args) {
        final String rok = "rock";
        final String papr = "paper";
        final String scissrs = "scissors";
        final Scanner decision = new Scanner(System.in);
        int versus = 0;
        while (versus == 0) {
            System.out.print("Rock, Paper, or Scissors? ");
            String playerChoice = decision.nextLine();
            playerChoice = playerChoice.toLowerCase();
            if (!playerChoice.equals(rok) && !playerChoice.equals(papr)
                                         && !playerChoice.equals(scissrs)) {
                System.out.println("Invalid input");
                System.exit(0);
            }
            final String computerChoice = opponentChoice(rok, papr, scissrs);
            System.out.println("Computer chose " + computerChoice + ".");
            versus = compare(playerChoice, computerChoice, rok, papr, scissrs);
        }
        System.out.println("\nDone.");
    }
}
