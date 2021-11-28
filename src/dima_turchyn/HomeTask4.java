package dima_turchyn;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number 'a', 'b': ");
        int a = in.nextInt();
        int b = in.nextInt();

        int result = a / b;
        int rest = a % b;

        System.out.println(result);
        System.out.println(rest);
    }
}
