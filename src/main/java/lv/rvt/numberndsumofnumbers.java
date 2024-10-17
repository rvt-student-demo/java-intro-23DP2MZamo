package lv.rvt;

import java.util.Scanner;

public class numberndsumofnumbers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int count = 0;
    int summa = 0;

        while(true){

            System.out.println("Give a number: ");

            int number = Integer.valueOf(scan.nextLine());

            if (number == 0){
                break;
            }
            else {
                summa = summa + number;
                count++;
            }

}
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of numbers: " + summa);
    }
}