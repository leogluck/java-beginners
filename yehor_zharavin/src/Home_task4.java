import java.util.Scanner;


public class Home_task4 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String CallNumber = scanner.nextLine();

        String CallPrice;

        switch (CallNumber){

            case "Київ":
                CallPrice = "1.25грн/мин";
                break;
            case "(044)":
                CallPrice = "1.25грн/мин";
                break;
            case "Львів":
                CallPrice = "1.98грн/мин";
                break;
            case "(032)":
                CallPrice = "1.98грн/мин";
                break;
            case "Полтава":
                CallPrice = "3.05грн/мин";
                break;
            case "(0532)":
                CallPrice = "3.05грн/мин";
                break;

            default:
                CallPrice = "No information(((";



        }
System.out.println(CallPrice);



    }
}
