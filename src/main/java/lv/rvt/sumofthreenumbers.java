package lv.rvt;

import java.util.Scanner;

public class sumofthreenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the fird number: ");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (first + second + thirdNumber));
    }
}