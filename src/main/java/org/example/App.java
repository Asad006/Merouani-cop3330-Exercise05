/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
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
