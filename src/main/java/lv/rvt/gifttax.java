package lv.rvt;

import java.util.Scanner;

public class gifttax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        int first = Integer.valueOf(scanner.nextLine());
        double formula5 = (100 + (first - 5000) * 0.08);
        double formula25 = (1700 + (first - 25000) * 0.1);
        double formula55 = (4700 + (first - 55000) * 0.12);
        double formula200 = (22100 + (first - 200000) * 0.15);
        double formula1000 = (142100 + (first - 1000000) * 0.17);
        if (first < 5000){
            System.out.println("No tax!");
        } else if (first >= 5000 && first <= 25000){
            System.out.println("Tax: " + formula5);
        } else if (first >= 25000 && first <= 55000) {
            System.out.println("Tax: " + formula25);
        } else if (first >= 55000 && first <= 200000){
            System.out.println("Tax: " + formula200);
        } else if (first >= 200000 && first <= 1000000){
            System.out.println("Tax: " + formula1000);
        } else{
            System.out.println("No tax!");
        }
    }
}
