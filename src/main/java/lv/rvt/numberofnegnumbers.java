package lv.rvt;

import java.util.Scanner;

public class numberofnegnumbers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int count = 0;
        while(true){
            
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scan.nextInt());
            if (number == 0) {
            break;
            }else if(number < 0){
                count++;
            }
}
        System.out.println("Number of negative numbers: " + count);
    }
}