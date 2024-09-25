package lv.rvt;

import java.util.Scanner;

public class secondsinday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        int seconds = number * 24 * 3600;
        System.out.println(seconds);

    }
}