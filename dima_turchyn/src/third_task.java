import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        int number_1 = in.nextInt();
        System.out.printf("Enter number 2: ");
        int number_2 = in.nextInt();
        System.out.printf("Enter number 3 : ");
        int number_3 = in.nextInt();
        if (number_1 > number_2 & number_1 > number_3 & number_1 != number_2 & number_1 != number_3) {
            System.out.println(number_1 + " is the biggest");
        } else if (number_2 > number_1 & number_2 > number_3 & number_2 != number_3 & number_2 != number_1) {
            System.out.println(number_2 + " is the biggest");
        } else if (number_3 > number_2 & number_3 > number_1 & number_3 != number_2 & number_3 != number_1) {
            System.out.println(number_3 + " is the biggest");
        }
    }
}