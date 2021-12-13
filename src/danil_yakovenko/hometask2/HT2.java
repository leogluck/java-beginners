package danil_yakovenko.hometask2;

import java.util.Scanner;

public class HT2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int aNumber = in.nextInt();
        System.out.print("Input b: ");
        int bNumber = in.nextInt();
        System.out.print("Input c: ");
        int cNumber = in.nextInt();
        int ans_1 = (aNumber = (bNumber * cNumber)) / 2;
        int ans_2 = ((aNumber * aNumber) + (bNumber * bNumber)) / 2;
        int ans_3 = ((aNumber + bNumber) / 12 * cNumber % 4 + bNumber);
        int ans_4 = (aNumber - bNumber * cNumber) / (aNumber + bNumber) % cNumber;

        System.out.println("Ответ номер 1 - " + ans_1);
        System.out.println("Ответ номер 2 - " + ans_2);
        System.out.println("Ответ номер 3 - " + ans_3);
        System.out.println("Ответ номер 4 - " + ans_4);
    }
}
