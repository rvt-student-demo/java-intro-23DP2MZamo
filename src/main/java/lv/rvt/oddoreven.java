package lv.rvt;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int numbah = Integer.valueOf(scanner.nextLine());
        if (numbah % 2 == 0){
            System.out.println("The number " + numbah + " is even");
        } else{
            System.out.println("The number " + numbah + " is odd");
        }
    }
}