package pushkarov_misha;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number 'a', 'b' and 'c': ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = Math.max(Math.max(a, b), c);

        System.out.println(d);
    }
}
