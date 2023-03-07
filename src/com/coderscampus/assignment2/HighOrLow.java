package com.coderscampus.assignment2;

import java.util.Scanner;
import java.util.Random;

public class HighOrLow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number between 1 AND 100");
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
		
		int counter = 0;
		while (counter <= 4) {
			int userInput = scanner.nextInt();
			if (userInput >= 1 && userInput <= 100) {
				if (userInput > randomNum) {
					System.out.println("YOU GUESSED TOO HIGH...PICK A LOWER NUMBER");
					counter++;
				}
				if (userInput < randomNum) {
					System.out.println("YOU GUESSED TOO LOW...PICK A HIGHER NUMBER");
					counter++;

				} else if (userInput == randomNum) {
					System.out.println("you win");
					break;
				}

			}
			if (userInput <= 0 || userInput > 100) {
				System.out.println("u didnt guess with in range...guess again.");

			}
		}
		{
			System.out.println("you lose");
			System.out.println("the correct number was : " + randomNum);
		} 
	}
}
