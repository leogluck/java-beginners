package yehor_zharavin;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте значение числу a:");
        int a = in.nextInt();
        System.out.print("Задайте значение числу b:");
        int b = in.nextInt();

        double c = ((double) a) / ((double) b);
        System.out.println(c);
    }
}
