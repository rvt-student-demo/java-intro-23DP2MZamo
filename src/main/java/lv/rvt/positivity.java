package lv.rvt;

import java.util.Scanner;

public class positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is positive");
    }
    }
}