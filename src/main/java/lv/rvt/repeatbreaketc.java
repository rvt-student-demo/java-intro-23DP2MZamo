package lv.rvt;

import java.util.Scanner;

public class repeatbreaketc {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int count = 0;
        int summa = 0;
        double avarage = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers: ");
        while(true){
            int number = Integer.valueOf(scan.nextLine());

            if (number == -1){
                break;
            }
            else if (number % 2 == 0){
                even++;
                count++;
            }
            else {
                count++;
                odd++;
            }
            summa = summa + number;
}
        avarage = summa / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + summa);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avarage);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}