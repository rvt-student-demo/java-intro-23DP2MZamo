package lv.rvt;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int summa = 0;

        while(true){

            System.out.println("Give a number: ");

            int number = Integer.valueOf(scan.nextLine());

            if (number == 0){
                break;
            }
            else {
                summa = summa + number;
            }

}
        
        System.out.println("Sum of numbers: " + summa);
    }
}