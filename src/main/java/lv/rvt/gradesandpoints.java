package lv.rvt;

import java.util.Scanner;

public class gradesandpoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0 - 100]: ");
        int numbah = Integer.valueOf(scanner.nextLine());
        if (numbah > 100){
            System.out.println("Grade: Incredible!");
        } else if (numbah >= 90){
            System.out.println("Grade: 5");
        } else if (numbah >= 80){
            System.out.println("Grade: 4");
        } else if (numbah >= 70) {
            System.out.println("Grade: 3");
        } else if (numbah >= 60) {
            System.out.println("Grade: 2");
        } else if (numbah >= 50) {
            System.out.println("Grade: 1");
        } else if (numbah >= 0) {
            System.out.println("Grade: failed");
        } else{
            System.out.println("Grade: Impossible!");
        }
    }
}