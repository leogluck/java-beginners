import java.util.Scanner;

public class Max_input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input three numbers:");
        int a_numder = in.nextInt();
        int b_numder = in.nextInt();
        int c_numder = in.nextInt();
        if (a_numder>b_numder & a_numder>c_numder){
            System.out.println("Maximal number is "+a_numder);
        }
        else if (b_numder>a_numder & b_numder>c_numder){
            System.out.println("Maximal number is "+b_numder);
        }
        else if (c_numder>b_numder & c_numder>a_numder){
            System.out.println("Maximal number is "+c_numder);
        }

    }
}