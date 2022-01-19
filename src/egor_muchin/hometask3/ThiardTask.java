package egor_muchin.hometask3;

import java.util.Scanner;

public class ThiardTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input three numbers:");
        int aNumber = in.nextInt();
        int bNumber = in.nextInt();
        int cNumber = in.nextInt();

        if (aNumber > bNumber && bNumber > cNumber) {
            System.out.println("Maximal number is " + aNumber);
        } else if (bNumber > aNumber && bNumber > cNumber) {
            System.out.println("Maximal number is " + bNumber);
        } else if (cNumber > bNumber && cNumber > aNumber) {
            System.out.println("Maximal number is " + cNumber);
        }
    }
}