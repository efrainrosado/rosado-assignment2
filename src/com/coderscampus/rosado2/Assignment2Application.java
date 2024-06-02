package com.coderscampus.rosado2;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment2Application {

	public static int getValidGuess(String prompt, int minValue, int maxValue) {
		
		// Must make the getVaildGuess Method before creating the guessingGame Method
		// The scope of information is needed for input 
		// into the guessingGame method
		// Additionally, must import java.util.InputMismatchException to catch user input
		// that is not an Integer, wanted to test this out and see how this works. 
		
		Scanner scanner = new Scanner(System.in);
		     while (true) {
		          try {
		               System.out.print(prompt);
		               int userInput = scanner.nextInt();
		               if (minValue <= userInput && userInput <= maxValue) {
		                   return userInput;
		               } else {
		                  System.out.printf("Your guess is not between 1 and 100, please try again. ", minValue, maxValue);
		                }
		            } catch (InputMismatchException e) {
		                System.out.println("Invalid input. Please enter an integer value.");
		                scanner.nextLine(); 
		            }
		        }
		    }
	
	
		    public static void guessingGame() {
		        Random random = new Random();
		        int randomNumber = random.nextInt(100) + 1;
		        int attempts = 5;

		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("You have 5 attempts to guess the number between 1 and 100.");

		        for (int i = 0; i < attempts; i++) {
		            int guess = getValidGuess("Pick a number between 1 and 100: ", 1, 100);

		            if (guess < randomNumber) {
		                System.out.println("Please pick a higher number.");
		            } else if (guess > randomNumber) {
		                System.out.println("Please pick a lower number.");
		            } else {
		                System.out.println("You win!");
		                return;
		            }
		        }

		        System.out.println("You lose, the number to guess was: " + randomNumber);
		    }
		    
		 // This method is created last after getValidGuess method is created
		 // This how the actual game is created. The "for loop" method is used 
		 // in this method and after 5 attempts user input is terminated and
		 // the random number is randomly generated between 0-100 and then number is 
		 // is plus up by 1. Must ensure we have return statement so method can be imported
		 // into the main method.
		    
		    public static void main(String[] args) {
		        guessingGame();
		    }
		
		    // last step is importing the guessingGame method into main method then run the 
		    // Java application.

}


