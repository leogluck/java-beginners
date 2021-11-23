package sabetskyi_stanislav.hometask3;

import java.util.Scanner;

public class TelephoneCall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 5 first numbers of your phone number:");
        int phoneNumber = in.nextInt();
        double costOfCall = 0;
        String cityName = null;
        switch (phoneNumber) {
            case 38044:
                cityName = "Kiev";
                costOfCall = 1.25;
                break;
            case 38032:
                cityName = "Lviv";
                costOfCall = 1.98;
                break;
            case 38053:
                cityName = "Poltava";
                costOfCall = 3.05;
                break;
            default:
                System.out.println("Unexpected value: " + phoneNumber);
                break;
        }
        double cost = costOfCall * 10;
        System.out.println("Your city is " + cityName);
        System.out.println("Call for 10 minutes will cost " + cost);
    }
}
