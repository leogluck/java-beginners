import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a_numder = in.nextInt();
        System.out.print("Input b: ");
        int b_numder = in.nextInt();
        System.out.print("Input c: ");
        int c_numder = in.nextInt();
        int ans_1 = (a_numder + (b_numder * c_numder)) / 2;
        int ans_2 = ((a_numder * a_numder) + (b_numder * b_numder)) / 2;
        int ans_3 = (a_numder + b_numder) / 12 * c_numder % 4 + b_numder;
        int ans_4 = (a_numder - b_numder * c_numder) / (a_numder + b_numder) % c_numder;
        System.out.printf("a+b*c/2= %d \n", ans_1);
        System.out.printf("(a^2+b^2)/2= %d \n", ans_2);
        System.out.printf("(a+b)/12*c%%4+b= %d \n", ans_3);
        System.out.printf("(a-b*c)/(a+b)%%c= %d \n", ans_4);
    }
}