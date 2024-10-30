package lv.rvt;

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numb = Integer.valueOf(scan.nextInt());
        for (int i = numb; i <= 100; i++){
            System.out.println(i);
        }
        }
    }