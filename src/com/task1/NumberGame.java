package com.task1;

//Number Game
//1. Generate a random number within a specified range, such as 1 to 100.
//2. Prompt the user to enter their guess for the generated number.
//3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
//4. Repeat steps 2 and 3 until the user guesses the correct number.
//You can incorporate additional details as follows:
//5. Limit the number of attempts the user has to guess the number.
//6. Add the option for multiple rounds, allowing the user to play again.
//7. Display the user's score, which can be based on the number of attempts taken or rounds won....

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);        
        Random random = new Random();
        System.out.println("Welcome to the Number Guessing Game!");
        int score = 0;
        boolean playGame = true;
        
         while (playGame) {
           int targetNumber=random.nextInt(100)+1;
           int attempts=0;
           int maxAttempts=7;

            System.out.println("Guess the number  between 1 and 100. Can you guess it?");

            while (true) {
                System.out.print("Enter your guess number:");
                int Guessuser=scanner.nextInt();
                attempts++;

                if (Guessuser==targetNumber) {
                    System.out.println("Congratulations! You guessed the number"+targetNumber+" in "+attempts+" attempts.");
                    score++;
                    break;
                }
                else if (Guessuser<targetNumber) {
                    System.out.println(" This number is Too low! Try again.");
                } 
                else {
                    System.out.println("This number Too high! Try again.");
                }
            }

            if (attempts>=maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain=scanner.nextLine();
            playGame=playAgain.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: "+score);
       scanner.close();//close the scanner
    }
}