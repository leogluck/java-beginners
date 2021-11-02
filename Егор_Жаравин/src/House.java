import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x:");
        int x = in.nextInt();
        System.out.printf("Ваш номер: %d", x);
        in.close();

        Scanner out = new Scanner(System.in  );
        System .out.print("Введите число y:");
        int y=in.nextInt();
        System.out.printf("Ваш номер: %d", y);
        in.close();
        int d=x+y;
        System.out.println(d);
    }
}
