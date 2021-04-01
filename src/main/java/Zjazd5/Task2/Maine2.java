package Zjazd5.Task2;

import java.util.Scanner;

public class Maine2 {
    public static void main(String[] args) {

        getName();

    }

    public static void getName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String firstName = scan.nextLine();
        System.out.println("Masz na imię " + firstName);
    }
}
