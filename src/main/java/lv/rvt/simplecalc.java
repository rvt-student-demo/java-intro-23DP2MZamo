package lv.rvt;

import java.util.Scanner;

public class simplecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int summa = first + second;
        int minus = first - second;
        int multipl = first * second;
        int divis = first / second;
        System.out.println(first + " + " + second + " = " + summa);
        System.out.println(first + " - " + second + " = " + minus);
        System.out.println(first + " * " + second + " = " + multipl);
        System.out.println(first + " / " + second + " = " + divis);
    }
}