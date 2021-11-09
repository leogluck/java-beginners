import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input call code: ");
        int code = in.nextInt();
        double cost;

        switch(code) {
            case 044:
                System.out.println("ggs");
                cost = 1.25 * 10;
            break;
            case 032:
                cost = 1.98 * 10;
            break;
            case 0532:
                cost = 3.05 * 10;
            break;
            default:
                cost = 0.0;
        }

        System.out.println(cost);
    }
}
