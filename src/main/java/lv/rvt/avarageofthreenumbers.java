package lv.rvt;

import java.util.Scanner;

public class avarageofthreenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int thirdnumbe = Integer.valueOf(scanner.nextLine());
        double formula = (first + second + thirdnumbe) / 3.0;
        System.out.println(" The average is:  " + formula);
    }
}