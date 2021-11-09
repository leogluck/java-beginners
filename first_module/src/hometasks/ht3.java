package hometasks;
import java.util.Scanner;

public class ht3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a_number = in.nextInt();
        System.out.print("Input b: ");
        int b_number = in.nextInt();
        System.out.print("Input c: ");
        int c_number = in.nextInt();
        int ans_1 = (a_number = (b_number * c_number)) / 2;
        int ans_2 = ((a_number * a_number) + (b_number * b_number)) / 2;
        int ans_3 = ((a_number + b_number) / 12 * c_number % 4 + b_number);
        int ans_4 = (a_number - b_number * c_number) / (a_number + b_number) % c_number;

        System.out.println("Ответ номер 1 - " + ans_1);
        System.out.println("Ответ номер 2 - " + ans_2);
        System.out.println("Ответ номер 3 - " + ans_3);
        System.out.println("Ответ номер 4 - " + ans_4);
    }
}
