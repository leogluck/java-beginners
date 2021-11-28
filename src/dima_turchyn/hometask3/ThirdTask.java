package dima_turchyn.hometask3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        int number1 = in.nextInt();
        System.out.printf("Enter number 2: ");
        int number2 = in.nextInt();
        System.out.printf("Enter number 3 : ");
        int number3 = in.nextInt();
        if (number1 > number2 & number1 > number3 & number1 != number2 & number1 != number3) {
            System.out.println(number1 + " is the biggest");
        } else if (number2 > number1 & number2 > number3 & number2 != number3 & number2 != number1) {
            System.out.println(number2 + " is the biggest");
        } else if (number3 > number2 & number3 > number1 & number3 != number2 & number3 != number1) {
            System.out.println(number3 + " is the biggest");
        }
    }
}