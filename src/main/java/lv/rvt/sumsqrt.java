package lv.rvt;

import java.util.Scanner;

public class sumsqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.valueOf(scanner.nextLine());
        double bumbah = Double.valueOf(scanner.nextLine());
        double formula = number + bumbah;
        double sqrt = Math.sqrt(formula);
        System.out.println(sqrt);
    }
}