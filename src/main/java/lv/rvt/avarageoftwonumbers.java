package lv.rvt;

import java.util.Scanner;

public class avarageoftwonumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        double formula = (first + second) / 2.0;
        System.out.println(" The average is:  " + formula);
    }
}