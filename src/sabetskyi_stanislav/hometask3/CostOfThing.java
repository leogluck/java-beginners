package sabetskyi_stanislav.hometask3;

import java.util.Scanner;

public class CostOfThing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input cost of goods:");
        int cost = in.nextInt();
        if (cost >= 0 & cost <= 100) {
            System.out.printf("Sale ist 0%%");
        } else if (cost >= 101 & cost <= 200) {
            System.out.printf("Sale ist 2%%");
        } else {
            System.out.printf("Sale ist 5%%");
        }

    }
}
