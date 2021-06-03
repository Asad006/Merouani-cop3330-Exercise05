/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 first_name last_name

**/
/*
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have
to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as
shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the
value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.

 */
package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        String[] stringInput = {"0", "0"};
        int input1, input2;

        App app = new App();

        Scanner scanner = new Scanner(System.in);

        stringInput = app.getUserInput(scanner);

        input1 = app.convertStringToInteger(stringInput[0]);
        input2 = app.convertStringToInteger(stringInput[1]);

        app.getAddition(input1, input2);
        app.getSubtraction(input1, input2);
        app.multiplication(input1, input2);
        app.getDivision(input1, input2);

    }

    private void getAddition(int num1, int num2) {
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

    }

    private void getDivision(int num1, int num2) {
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
    }

    private void getSubtraction(int num1, int num2) {
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
    }

    private void multiplication(int num1, int num2) {
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
    }

    private int convertStringToInteger(String string) {
        int input;
        //d1 = Double.parseDouble(s1);
        input = Integer.parseInt(string);

        return input;
    }

    private String[] getUserInput(Scanner scanner) {

        String[] input = {"0", "0"};

        System.out.print("What is the first number? ");
        input[0] = scanner.nextLine();
        System.out.print("What is the second number? ");
        input[1] = scanner.nextLine();

        return input;
    }
}
