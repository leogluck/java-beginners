import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = in.nextInt();
        System.out.print("Input your money: ");
        int money = in.nextInt();
      
        if (age > 18 && money > 500) {
            System.out.printf("Your welcome");
        } else if (age < 18 && money > 700) {
            System.out.printf("Ok you can go, but next time..");
        } else {
            System.out.printf("You shell not pass!");
        }
    }
}