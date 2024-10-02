package lv.rvt;

import java.util.Scanner;

public class ltoet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first number ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give me the second number");
        int second = Integer.valueOf(scanner.nextLine());
        if (first > second) {
            System.out.println("The greater number is: " + first);
        } else if (first < second ){
            System.out.println("The greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
    }
    }
}