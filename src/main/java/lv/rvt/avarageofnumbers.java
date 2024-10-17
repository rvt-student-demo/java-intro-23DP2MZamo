package lv.rvt;

import java.util.Scanner;

public class avarageofnumbers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int count = 0;
    int summa = 0;
        int avarage = 0;
        while(true){

            System.out.println("Give a number: ");

            int number = Integer.valueOf(scan.nextLine());

            if (number == 0){
                break;
            }
            else {
                summa = summa + number;
                count++;
                avarage = summa / count;
            }

}
        System.out.println("Avarage of numbers: " + avarage);
    }
}