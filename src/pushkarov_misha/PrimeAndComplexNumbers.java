package pushkarov_misha;

import java.util.Scanner;

public class PrimeAndComplexNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int enteredNum = in.nextInt();
        String result = "prime number";

        for (int i = 2; i < enteredNum / 2; i++) {
            if (enteredNum % i == 0) {
                result = "complex number";

                break;
            }
        }

        System.out.println(result);
    }
}
