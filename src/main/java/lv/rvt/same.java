package lv.rvt;

import java.util.Scanner;

public class same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String second = scanner.nextLine();
        if (first.equals(second)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }
    }
}