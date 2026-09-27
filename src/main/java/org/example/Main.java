package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random generate = new Random();
    public static int numberToGuess = generate.nextInt(100);
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to the Number Guessing Game!\n" +
                    "I'm thinking of a number between 1 and 100.\n" +
                    "You have 5 chances to guess the correct number");

            System.out.println("Please select the difficulty level:\n" +
                    "1. Easy (10 chances)\n" +
                    "2. Medium (5 chances)\n" +
                    "3. Hard (3 chances)");

            System.out.print("\nEnter your choice: ");
            int difficultyLevel = scan.nextInt();

            switch (difficultyLevel) {
                case 1:
                    System.out.println("Great! You have selected the Easy difficulty level.\n" +
                            "Let's start the game!");
                    levelGuessNumber(10);
                    System.out.println("That number was " + numberToGuess);
                    break;
                case 2:
                    System.out.println("Great! You have selected the Medium difficulty level.\n" +
                            "Let's start the game!");
                    levelGuessNumber(5);
                    System.out.println("That number was " + numberToGuess);
                    break;
                case 3:
                    System.out.println("Great! You have selected the Hard difficulty level.\n" +
                            "Let's start the game!");
                    levelGuessNumber(3);
                    System.out.println("That number was " + numberToGuess);
                    break;
                default:
                    System.out.println("Invalid input.");
                    return;
            }

            break;
        }
    }

    public static void levelGuessNumber(int chances) {
        int tries = 0;

        while(chances > 0) {
            System.out.println("\nEnter your guess:");
            int inputNumber = scan.nextInt();
            tries++;
            chances--;

            if(inputNumber == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number in" + tries + "attempts.");
                return;
            } else if(inputNumber < numberToGuess) {
                System.out.println("This number is greater than " + inputNumber);
            } else {
                System.out.println("This number is less than " + inputNumber);
            }

        }


    }

}