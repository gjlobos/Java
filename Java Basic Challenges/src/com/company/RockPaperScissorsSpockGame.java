package com.company;

import java.util.Scanner;

public class RockPaperScissorsSpockGame {

    // Challenge 3
    // Modify the whichWin feature from Challenge 2 to play the Spock
    // variant: There is another possibility, Mr. Spock—formed by
    // the Vulcan hand of Star Trek—has other powers according to:
    // Paper disapproves of Spock
    // Spock smashes scissors
    // Spock vaporizes stone
    private enum ChoiceSpock {
        ROCK, PAPER, SCISSORS, SPOCK
    }

    public static final int NUM_ROUNDS = 5;

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
            // Enter players' choices
            System.out.println("Enter player's 1 choice (rock, paper, scissors or spock): ");
            String choicePlayer1Input = scanner.nextLine();

            if (choicePlayer1Input.equals("*")) {
                System.out.println(namePlayer1 + " has chosen to end the game. Exiting...");
                break;
            }

            ChoiceSpock choicePlayer1 = getValidChoice(choicePlayer1Input);
            // The input is read as a string and then converted to a value of
            // type Choice. This is done using the getValidChoice() method.

            if (choicePlayer1 == null) {
                System.out.println("Invalid choice. The game ends.");
                break;
            }

            System.out.println("Enter player's 2 choice (rock, paper, scissors or spock): ");
            ChoiceSpock choicePlayer2 = getValidChoice(scanner.nextLine());
            // The input is read as a string and then converted to a value of
            // type Choice. This is done using the getValidChoice() method.


            if (choicePlayer2 == null) {
                System.out.println("Invalid choice. The game ends.");
                break;
            }

            // Compare the choices of each player and determine the winner
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
    // the valid options ("rock", "paper", "scissors" or "spock"), it returns
    // the corresponding value of the enum. Otherwise, it returns null,
    // indicating that the choice is invalid.
    public static ChoiceSpock getValidChoice(String choice) {
        switch (choice.toLowerCase()) {
            case "rock":
                return ChoiceSpock.ROCK;
            case "paper":
                return ChoiceSpock.PAPER;
            case "scissors":
                return ChoiceSpock.SCISSORS;
            case "spock":
                return ChoiceSpock.SPOCK;
            default:
                return null;
        }
    }

    // Define function whichWins() with two parameters with the
    // choice of each player.
    // The function must return 0 in case of a tie, 1 if player 1 wins
    // or 2 if player 2 wins.

    public static Integer whichWins(ChoiceSpock choicePlayer1, ChoiceSpock choicePlayer2) {
        // Implement the function

        if (choicePlayer1 == choicePlayer2) {
            return 0;
        } else if ((choicePlayer1 == ChoiceSpock.ROCK && choicePlayer2 == ChoiceSpock.SCISSORS)
                || (choicePlayer1 == ChoiceSpock.PAPER && choicePlayer2 == ChoiceSpock.ROCK)
                || (choicePlayer1 == ChoiceSpock.SCISSORS && choicePlayer2 == ChoiceSpock.PAPER)
                || (choicePlayer1 == ChoiceSpock.SPOCK && choicePlayer2 == ChoiceSpock.SCISSORS)
                || (choicePlayer1 == ChoiceSpock.SPOCK && choicePlayer2 == ChoiceSpock.ROCK)
                || (choicePlayer1 == ChoiceSpock.PAPER && choicePlayer2 == ChoiceSpock.SPOCK)) {
            return 1;
        } else  {
            return 2;
        }
    }
}
