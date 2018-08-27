package com.fortuneteller;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		// declare and initialize output variables
		String yearsToRetirement = "";
		String vacationHomeLocation = "";
		double bankBalance = 0;
		String transportationMode = "";

		// open new Scanner for user input
		Scanner input = new Scanner(System.in);

		// Ask for and store user's first name
		System.out.println("Tell me your first name.");
		String firstName = input.nextLine();
		// check if user wants to quit program
		checkForQuit(firstName); 

		// Ask for and store user's last name
		System.out.println("Tell me your last name.");
		String lastName = input.nextLine();
		checkForQuit(lastName);

		// Ask for and store user's age
		System.out.println("Tell me your age.");
		String ageAsString = input.nextLine();
		checkForQuit(ageAsString);
		int age = Integer.parseInt(ageAsString);

		// Ask for and store user's birth month as a number
		System.out.println("What month were you born? Enter month as a number.");
		String birthMonthAsString = input.nextLine();
		checkForQuit(birthMonthAsString);
		int birthMonth = Integer.parseInt(birthMonthAsString);

		// Ask for and store user's favorite ROYGBIV color
		System.out.println(
				"What's your favorite ROYGBIV color? Enter \"help\" for a list of ROYGBIV colors if you were never taught about rainbows.");
		String color = input.nextLine();
		checkForQuit(color);
		color = color.toLowerCase();

		// list ROYGBIV colors if user types help
		while (color.equals("help")) {
			System.out.println("ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			color = input.nextLine();
			checkForQuit(color);
			color = color.toLowerCase();
		}

		// ask for and store number of siblings the user has
		System.out.println("How many siblings do you have?");
		String siblingsAsString = input.nextLine();
		checkForQuit(siblingsAsString);
		int siblings = Integer.parseInt(siblingsAsString);

		// calculate user's years to retirement based on if their age input is even or
		// odd
		if (age % 2 == 0) {
			yearsToRetirement = "8 years";
		} else {
			yearsToRetirement = "25 years";
		}

		// determine user's vacation home location from their input for number of
		// siblings
		if (siblings < 0) {
			vacationHomeLocation = "Amity Island (Watch out for sharks...)";
		} else if (siblings == 0) {
			vacationHomeLocation = "Atlantis";
		} else if (siblings == 1) {
			vacationHomeLocation = "The Shire (Enjoy the second breakfasts!)";
		} else if (siblings == 2) {
			vacationHomeLocation = "Hogsmeade (I hear the butterbeer is tasty there!)";
		} else if (siblings == 3) {
			vacationHomeLocation = "The Hundred Acre Wood (It has all the honey you can eat!)";
		} else {
			vacationHomeLocation = "Emerald City";
		}

		// determine user's mode of transportation from their favorite ROYGBIV color
		// input
		switch (color) {
		case "red":
			transportationMode = "race car";
			break;
		case "orange":
			transportationMode = "eagle";
			break;
		case "yellow":
			transportationMode = "broomstick";
			break;
		case "green":
			transportationMode = "unicycle";
			break;
		case "blue":
			transportationMode = "pirate ship";
			break;
		case "indigo":
			transportationMode = "magic carpet";
			break;
		case "violet":
			transportationMode = "unicorn";
			break;
		}

		// calculate user's bank balance based on user's birth month as a number
		if (birthMonth > 0 && birthMonth < 5) {
			bankBalance = 455432324.33;
		} else if (birthMonth > 4 && birthMonth < 9) {
			bankBalance = 644554.74;
		} else if (birthMonth > 8 && birthMonth < 13) {
			bankBalance = 5216.44;
		} else {
			bankBalance = 0.00;
		}
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

		// output user's fortune
		System.out.println("*" + firstName + "* *" + lastName + "* will retire in *" + yearsToRetirement + "* with *"
				+ currency.format(bankBalance) + "* in the bank, a vacation home in *" + vacationHomeLocation
				+ "*, and travel by *" + transportationMode + "*.");

		// close Scanner input
		input.close();
	}

	public static void checkForQuit(String input) {
		// check if input is "quit" and if so quit program
		if (input.toLowerCase().equals("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}
	}
}
