package lv.rvt;

import java.util.Scanner;

public class programmtick {
    public static void main(String[] args) {
        // The task is to keep count of number ones
    Scanner scanner = new Scanner(System.in);

// The task is to keep track of number ones
int ones = 0;

// The task is to read an input from the user
while (true) {
    System.out.println("Give a number (end with 0): ");
    // The task is to read a user inputted number
    int number = Integer.valueOf(scanner.nextLine());

    // The task is to exit the loop if the user
    // has inputted zero
    if (number == 0) {
        break;
    }

    // The task is to increase the amount of ones
    // if the user inputs a number one
    if (number == 1) {
        ones = ones + 1;
    }
}

// The task is to print out the total of ones
System.out.println("The total of ones: " + ones);
}
    }