package com.company;

import java.util.Scanner;

public class RockPaperScissorsGame {

    // Challenge 2
    // Make a program that allows you to play "Rock, Paper, Scissors."
    // First of all, the application requests the name of each gamer,
    // then the game starts. The game consists in asking which option
    // each one chooses and adding points to the winner -if there is
    // one-. Define and use a function called whichWins with two
    // parameters with the moves of each one, which returns 0 in case
    // of a tie, 1 if first wins, 2 if second wins. Game is over when
    // the first one chooses “*” as the end indicator.

    // Define an enumerated type representing the available choices
    // for the "Rock, Paper, Scissors" game.
    // Enumerations are a way to create a fixed set of named constants
    // in Java.
    // The options are declared in uppercase, which is a common
    // convention for enums in Java.

    public enum Choice {
        ROCK, PAPER, SCISSORS
    }

    public static final int NUM_ROUNDS = 3;

    public static void main(String[] args) {

        // Request the name of each gamer
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of player 1: ");
        String namePlayer1 = scanner.nextLine();

        System.out.println("Enter the name of player 2: ");
        String namePlayer2 = scanner.nextLine();

        // Build a loop so that the game is repeated 3 times
        // Input each player's choice (rock, paper, scissors)
        // If player 1 chooses "*", the game ends
        // Inside the loop, use the whichWins() function to get the score
        // Each player's score must be added to an accumulator
        Integer scorePlayer1 = 0;
        Integer scorePlayer2 = 0;


        for (int i = 0; i < NUM_ROUNDS; i++) {
            System.out.println("Enter player's 1 choice (rock, paper or scissors): ");
            String choicePlayer1Input = scanner.nextLine();

            if (choicePlayer1Input.equals("*")) {
                System.out.println(namePlayer1 + " has chosen to end the game. Exiting...");
                break;
            }

            Choice choicePlayer1 = getValidChoice(choicePlayer1Input);
            // The input is read as a string and then converted to a value of
            // type Choice. This is done using the getValidChoice() method.

            System.out.println("Enter player's 2 choice (rock, paper or scissors): ");
            Choice choicePlayer2 = getValidChoice(scanner.nextLine());
            // The input is read as a string and then converted to a value of
            // type Choice. This is done using the getValidChoice() method.


            if (choicePlayer1 == null || choicePlayer2 == null) {
                System.out.println("Invalid choice. The game ends.");
                break;
            }

            Integer score = whichWins(choicePlayer1, choicePlayer2);
            if (score == 1) {
                System.out.println("Player 1 wins");
                System.out.println(" ");
                scorePlayer1++;
            } else if (score == 2) {
                System.out.println("Player 2 wins");
                System.out.println(" ");
                scorePlayer2++;
            } else {
                System.out.println("Tie");
                System.out.println(" ");
            }
        }

        // Compare the totals of both players
        // and display the name of the winner and the final results of the game
        if (scorePlayer1 > scorePlayer2) {
            System.out.println("The winner is: " + namePlayer1);
        } else if (scorePlayer1 < scorePlayer2) {
            System.out.println("The winner is: " + namePlayer2);
        } else {
            System.out.println("There's no winner: ");
        }

        System.out.println("score Player 1: " + scorePlayer1);
        System.out.println("score Player 2: " + scorePlayer2);
    }

    // Add input validation to handle unexpected inputs
    // The getValidChoice() method is responsible for converting each
    // player's input to a Choice value. If the input matches any of
    // the valid options ("rock", "paper", or "scissors"), it returns
    // the corresponding value of the enum. Otherwise, it returns null,
    // indicating that the choice is invalid.
    public static Choice getValidChoice(String choice) {
        switch (choice.toLowerCase()) {
            case "rock":
                return Choice.ROCK;
            case "paper":
                return Choice.PAPER;
            case "scissors":
                return Choice.SCISSORS;
            default:
                return null;
        }
    }

    // Define function whichWins() with two parameters with the
    // choice of each player.
    // The function must return 0 in case of a tie, 1 if player 1 wins
    // or 2 if player 2 wins.

    public static Integer whichWins(Choice choicePlayer1, Choice choicePlayer2) {
        // Implement the function

        if (choicePlayer1 == choicePlayer2) {
            return 0;
        } else if ((choicePlayer1 == Choice.ROCK && choicePlayer2 == Choice.SCISSORS)
                || (choicePlayer1 == Choice.PAPER && choicePlayer2 == Choice.ROCK)
                || (choicePlayer1 == Choice.SCISSORS && choicePlayer2 == Choice.PAPER)) {
            return 1;
        } else  {
            return 2;
        }
    }
}
