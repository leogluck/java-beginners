package lesson4;

import java.util.Scanner;

public class EasyOrDifficult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input any number:");
        int number = in.nextInt();
        boolean ans = true;
        int num = 2;
        while (ans == true) {
            num++;
            if (number % num != 0) {
                continue;
            } else if (num == number) {
                System.out.println(number + " is easy number");
                break;
            } else if (number % num == 0) {
                System.out.println(number + " is difficult number");
                break;
            }
        }
    }


}




