package sabetskyi_stanislav.hometask3;

import java.util.Scanner;

public class MaxInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input three numbers:");
        int aNumber = in.nextInt();
        int bNumder = in.nextInt();
        int cNumder = in.nextInt();
        if (aNumber > bNumder && aNumber > cNumder) {
            System.out.println("Maximal number is " + aNumber);
        } else if (bNumder > aNumber && bNumder > cNumder) {
            System.out.println("Maximal number is " + bNumder);
        } else if (cNumder > bNumder && cNumder > aNumber) {
            System.out.println("Maximal number is " + cNumder);
        }

    }
}