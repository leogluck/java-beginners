package leo.lesson3;

import java.util.Scanner;

public class VegetablesShop {
    public static void main(String[] args) {
        System.out.println("Enter vegetable name to get the price");
        Scanner scanner = new Scanner(System.in);
        String vegetableName = scanner.nextLine();

        String vegetablePrice;

        switch (vegetableName) {
            case "cucumber":
                vegetablePrice = "2$";
                break;
            case "carrot":
                vegetablePrice = "1$";
                break;
            case "eggplant":
                vegetablePrice = "5$";
                break;
            default:
                vegetablePrice = "No such vegetable in our shop";
        }

        System.out.println(vegetablePrice);
    }
}
