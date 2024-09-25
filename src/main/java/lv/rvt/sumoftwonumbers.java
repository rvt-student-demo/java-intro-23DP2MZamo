package lv.rvt;

import java.util.Scanner;

public class sumoftwonumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int summa = first + second;
        System.out.println("Thes sum of two numbers is " + summa);
    }
}