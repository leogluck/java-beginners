package sabetskyi_stanislav;

import java.util.Scanner;

public class ClassClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input two numbers:");
        int aNumber = in.nextInt();
        int bNumber = in.nextInt();
        if (bNumber == 0) {
            System.out.printf("This numbers cant be division");
        } else {
            int ans = aNumber / bNumber;
            if (ans == 0 || bNumber == 0) {
                System.out.printf(String.valueOf(aNumber), "and", bNumber, "cant be division");
            } else {
                System.out.printf("%d", ans);
            }
        }
    }
}