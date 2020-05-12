package pack.Homework05;

import java.util.Scanner;

public class Calculation {

    public static void main (String[] args) {

        int a = 0;
        int b = 0;
        String input = "";
        boolean bool = true;
        boolean bool1 = true;
        System.out.println(" Please enter a positive number: ");

        while (bool == true) {
            try {
                Scanner scant = new Scanner(System.in);
                input = scant.nextLine();
                a = Integer.parseInt(input);
                bool = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }
        System.out.println(a);
        System.out.println(" Please enter another positive number: ");
        while (bool1 == true) {
            try {
                Scanner scant = new Scanner(System.in);
                input = scant.nextLine();
                b = Integer.parseInt(input);
                bool1 = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
        }
        System.out.println(b);
    }
}


