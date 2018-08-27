package com.fortuneteller;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me your first name.");
		String firstName = input.nextLine();
		System.out.println("Tell me your second name.");
		String lastName = input.nextLine();
		System.out.println("Tell me your age.");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("What month were you born? Enter month as a number.");
		int birthMonth = input.nextInt();
		input.nextLine();
		System.out.println("What's your favorite ROYGBIV color? Enter \"help\" for a list of ROYGBIV colors if you were never taught about rainbows.");
		String color = input.nextLine();
		while(!color.toLowerCase().equals("red")
				&& !color.toLowerCase().equals("orange")
				&& !color.toLowerCase().equals("yellow")
			    && !color.toLowerCase().equals("green")
				&& !color.toLowerCase().equals("blue")
				&& !color.toLowerCase().equals("indigo")
				&& !color.toLowerCase().equals("violet")) {
			System.out.println("ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			color = input.nextLine();
			
		}
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		input.nextLine();
		System.out.println("Birth month: " + birthMonth);
		System.out.println("Age: "+ age);
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Number of siblings: " + siblings);
		
		if(age % 2 == 0) {
			System.out.println("You will retire in 1 year! Lucky you!");
		} else {
			System.out.println("You still have 25 years until retirement, sorry...");
		}
		
		
		
		

	}

}
