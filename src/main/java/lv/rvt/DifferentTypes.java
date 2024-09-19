package lv.rvt;

import java.util.Scanner;

public class DifferentTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String text = scanner.nextLine();
        System.out.println("Give an integer: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double floatinpoint = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean truefalse = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave an integer: " + number);
        System.out.println("You gave the double: " + floatinpoint);
        System.out.println("You gave the boolean: " + truefalse);
    }
}