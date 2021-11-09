import java.util.Scanner;

public class TelephoneCall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 5 first numbers of your phone number:");
        int phone_number = in.nextInt();
        double CostOfCall = 0;
        String CityName = null;
        switch (phone_number) {
            case 38044:
                CityName = "Kiev";
                CostOfCall = 1.25;
                break;
            case 38032:
                CityName = "Lviv";
                CostOfCall = 1.98;
                break;
            case 38053:
                CityName = "Poltava";
                CostOfCall = 3.05;
                break;
            default:
                System.out.println("Unexpected value: " + phone_number);
                break;
        }
        double cost = CostOfCall * 10;
        System.out.println("Your city is " + CityName);
        System.out.println("Call for 10 minutes will cost " + cost);
    }
}
