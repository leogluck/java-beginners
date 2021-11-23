package yehor_zharavin;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x:");
        int x = in.nextInt();
        System.out.printf("Ваш номер: %d", x);
        System.out.print("Введите число y:");
        int y = in.nextInt();
        System.out.printf("Ваш номер: %d", y);
    }
}
