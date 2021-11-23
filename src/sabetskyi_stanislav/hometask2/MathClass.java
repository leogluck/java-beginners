package sabetskyi_stanislav.hometask2;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int aNumber = in.nextInt();
        System.out.print("Input b: ");
        int bNumber = in.nextInt();
        System.out.print("Input c: ");
        int cNumber = in.nextInt();
        int ans1 = (aNumber + (bNumber * cNumber)) / 2;
        int ans2 = ((aNumber * aNumber) + (bNumber * bNumber)) / 2;
        int ans3 = (aNumber + bNumber) / 12 * cNumber % 4 + bNumber;
        int ans4 = (aNumber - bNumber * cNumber) / (aNumber + bNumber) % cNumber;
        System.out.printf("a+b*c/2= %d \n", ans1);
        System.out.printf("(a^2+b^2)/2= %d \n", ans2);
        System.out.printf("(a+b)/12*c%%4+b= %d \n", ans3);
        System.out.printf("(a-b*c)/(a+b)%%c= %d \n", ans4);
    }
}