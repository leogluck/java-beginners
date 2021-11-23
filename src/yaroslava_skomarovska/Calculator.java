package yaroslava_skomarovska;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scanner = new Scanner("System.in");


        System.out.println(" a + b * ( c / 2 ) " );

        System.out.println(" ( a^2 + b^2 ) / 2 " );

        System.out.println("( a + b ) / 12 * c % 4 + b " );

        System.out.println(" (a - b * c ) / ( a + b ) % c " );
    }
}
