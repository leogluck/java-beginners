package yehor_zharavin;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String callNumber = scanner.nextLine();

        String callPrice;

        switch (callNumber) {
            case "Київ":
                callPrice = "1.25грн/мин";
                break;
            case "(044)":
                callPrice = "1.25грн/мин";
                break;
            case "Львів":
                callPrice = "1.98грн/мин";
                break;
            case "(032)":
                callPrice = "1.98грн/мин";
                break;
            case "Полтава":
                callPrice = "3.05грн/мин";
                break;
            case "(0532)":
                callPrice = "3.05грн/мин";
                break;
            default:
                callPrice = "No information(((";
        }

        System.out.println(callPrice);
    }
}
