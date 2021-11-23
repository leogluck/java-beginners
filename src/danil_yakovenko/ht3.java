package danil_yakovenko;

import java.util.Scanner;

public class ht3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        int number_1 = in.nextInt();
        System.out.printf("Введите число 2: ");
        int number_2 = in.nextInt();
        System.out.printf("Введите число 3 : ");
        int number_3 = in.nextInt();
        if (number_1>number_2 & number_1>number_3){
            System.out.println(number_1+" большее");
        }
        else if (number_2>number_1 & number_2>number_3){
            System.out.println(number_2+" большее");
        }
        else if (number_3>number_2 & number_3>number_1){
            System.out.println(number_3+" большее");
        }
    }
}
