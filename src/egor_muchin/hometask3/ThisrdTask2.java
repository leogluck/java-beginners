package egor_muchin.hometask3;


import java.util.Scanner;

public class ThisrdTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите два числа");
        int aNumber = in.nextInt();
        int bNumber = in.nextInt();
        if (aNumber == 0) {
            System.out.println("эти числа не могут делится");
        } else {
            int remainder = aNumber % bNumber;
            if (remainder == 0) {
                System.out.println(aNumber / bNumber + " делятся");
            } else {
                System.out.println("Не делятся. Остаток: " + remainder);
            }
        }
    }
}