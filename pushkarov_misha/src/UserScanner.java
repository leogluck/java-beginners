import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number 'a', 'b' and 'c': ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b * c / 2);
        System.out.println((a * 2 + b * 2) / 2);
        System.out.println((a + b) / 12 * c % 4 + b);
        System.out.println((a - b * c) / (a + b) % c);
    }
}
