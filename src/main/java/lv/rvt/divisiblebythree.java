package lv.rvt;

import java.util.Scanner;

public class divisiblebythree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
    }
    public static void divisibleByThreeInRange(int beggining, int end){
        for (int i = beggining; i <= end; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}