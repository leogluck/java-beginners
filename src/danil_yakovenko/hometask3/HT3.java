package danil_yakovenko.hometask3;

import java.util.Scanner;

public class HT3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        int number1 = in.nextInt();
        System.out.printf("Введите число 2: ");
        int number2 = in.nextInt();
        System.out.printf("Введите число 3 : ");
        int number3 = in.nextInt();
        if (number1 > number2 && number1 >= number3) {
            System.out.println(number1 + " большее");
        } else if (number2 > number1 && number2 >= number3) {
            System.out.println(number2 + " большее");
        } else if (number3 > number2 && number3 > number1) {
            System.out.println(number3 + " большее");
        }
    }
}