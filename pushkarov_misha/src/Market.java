import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the cost:");
        int cost = in.nextInt();

        if (cost > 0 && cost <= 100) {
            System.out.println("Your discount: 0%");
        }
        else if (cost > 100 && cost <= 200) {
            System.out.println("Your discount: 2%");
        }
        else if (cost > 200) {
            System.out.println("Your discount: 5%");
        }
        else {
            System.out.println("ERROR!");
        }
    }
}
