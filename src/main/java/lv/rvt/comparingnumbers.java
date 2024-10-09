package lv.rvt;

import java.util.Scanner;

public class comparingnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int numbah = Integer.valueOf(scanner.nextLine());
        if (number > numbah) {
            System.out.println(number + " is greater than " + numbah);
        } else if (number < numbah){
            System.out.println(number + " is smaller than " + numbah);
        }else {
            System.out.println(number + " is equal to " + numbah);
        }
    }
}