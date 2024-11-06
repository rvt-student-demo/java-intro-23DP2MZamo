package lv.rvt;

import java.util.Scanner;

public class fromonetoparameter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printUntilNumber(2);
    }
    public static void printUntilNumber(int numberOfTimes) {
        int number = 1;
        while (number <= numberOfTimes) {
            System.out.println(number);
            number++;
        }
    }
}