package lv.rvt;

import java.util.Scanner;

public class adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("you are an adult");
    }
    }
}