package leo.lesson5;

public class ContinueOperatorExample {
    public static void main(String[] args) {
        int[] numbers = {0, 3, 2, 7, 11, 6};

        for (int index = 0; index < numbers.length; index++) {
            int i = numbers[index] + 1;
            System.out.println("Number + 1 = " + i);

            if (numbers[index] % 2 == 0) {
                continue;
            }

            int j = numbers[index] + 2;
            System.out.println("Odd number + 2 = " + j);
        }
    }
}
