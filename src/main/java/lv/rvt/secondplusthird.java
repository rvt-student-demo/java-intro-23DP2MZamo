package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class secondplusthird{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = Integer.valueOf(scan.nextInt());
        int count = 1;
        int sum = 0;
        while (numbers != 0) {
            count++;
            numbers = Integer.valueOf(scan.nextInt());
            if (count == 2 ||  count == 3){
                sum += numbers;
            }
        }
        System.out.println(sum);

    }
}