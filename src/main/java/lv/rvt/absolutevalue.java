package lv.rvt;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        if (number < 0) {
            int formula = number * -1;
            System.out.println(formula);
        } else {
            System.out.println(number);
        }
    }
}