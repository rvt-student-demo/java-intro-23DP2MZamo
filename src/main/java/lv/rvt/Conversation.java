package lv.rvt;

import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! How are you?");
        String answer = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String second_answer = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}