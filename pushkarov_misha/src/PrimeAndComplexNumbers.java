import java.util.Scanner;

public class PrimeAndComplexNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int enteredNum = in.nextInt();
        String result = "prime number";

        for (int i = 0; i <= enteredNum; i++) {
            if (i != 0 && i != 1 && i != enteredNum) {
                if (enteredNum % i == 0) {
                    result = "complex number";

                    break;
                }
            }
            else {
                continue;
            }
        }

        System.out.println(result);
    }
}
