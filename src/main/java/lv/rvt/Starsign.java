package lv.rvt;

import java.util.Scanner;

public class Starsign{
    public static void printSquare(int size) {
        int counter = 0;
        while (counter < size) {
            printStars(size);
            counter++;
        }
        System.out.println("");
    }
    public static void printStars(int number) {
        for (int i = 0; i != number; i++){
            System.out.print('*');
        }
        System.out.println("");
    }
    public static void printRectang(int width, int height) {
        int counter = 0;
        while (counter < height) {
            printStars(width);
            counter++;
        }
    }
    public static void printTriang(int size){
        int counter = 0;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
        System.out.println(" ");
    }
    

    
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("-------------");
        printSquare(4);
        System.out.println("-------------");
        printRectang(17, 3);
        System.out.println("-------------");
        printTriang(5);
    }
}