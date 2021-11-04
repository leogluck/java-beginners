import java.util.Scanner;

public class Class_Class {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input two numbers:");
        int a_numder = in.nextInt();
        int b_numder = in.nextInt();
        if (b_numder == 0) {
            System.out.printf("This numbers cant be division");
            return;
        }
        else {
            int ans=a_numder/b_numder;
            if (ans == 0|| b_numder == 0){
                System.out.printf(String.valueOf(a_numder),"and", b_numder,"cant be division");
            }
            else {
                System.out.printf("%d",ans);
            }
        }
        }
    }