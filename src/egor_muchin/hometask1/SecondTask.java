package egor_muchin.hometask1;

import java.util.Scanner;

public class SecondTask<a, b, c> {
    public static void main(String[] args) {
        int b;
        int c;
        int a;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a:");
            a = in.nextInt();
            System.out.print("Enter b:");
            b = in.nextInt();
            System.out.print("Enter c: ");
            c = in.nextInt();
        }
        System.out.println((a + (b * c)) / 2);
        System.out.println(((a * a) + (b * b)) / 2);
        System.out.println((a + b) / 12 * c % 4 + b);
        System.out.println((a - b * c) / (a + b) % c);
    }
}
