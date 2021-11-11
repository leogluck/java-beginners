package lesson4;

import java.util.Scanner;

public class ClassWithBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone prefix:");

        int phonePrefix = scanner.nextInt();
        double costPerMinute;

        switch (phonePrefix) {
            case 044:
                costPerMinute = 1.23;
                break;
            case 0532:
                costPerMinute = 1.55;
                break;
            default:
                costPerMinute = 0;
        }

        double callPrice = costPerMinute * 10;

        System.out.println("Price of call is: " + callPrice);
    }
}
