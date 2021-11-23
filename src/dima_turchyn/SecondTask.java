package dima_turchyn;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter a: ");
        int a = in.nextInt();

        System.out.printf("Enter b: ");
        int b = in.nextInt();

        System.out.printf("Enter c: ");
        int c = in.nextInt();

        System.out.println((a + (b * c)) / 2);
        System.out.println(((a * a) + (b * b)) / 2);
        System.out.println((a + b) / 12 * c % 4 + b);
        System.out.println((a - b * c) / (a + b) % c);
    }
}
