package danil_yakovenko.finalWork;
import java.util.Arrays;
import java.util.Scanner;



public class finalWork {
    public static void main(String[] args){
        int[] password = new int[6];
        int[] newPassword = new int[6];
        int[] newNewPassword = new int[6];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            password[i] = scan.nextInt();
        }

        int number;
        int nmbr;
        for (int h = 0; h < 6; h++) {
            number = password[h];
            nmbr = number + '1';
            newPassword[h] = nmbr;
        }

        System.out.println("New password: ");
        for (int b = 0; b < newPassword.length; b++) {
            System.out.print(newPassword[b]);
        }

        System.out.println(" ");

        int number2;
        int nmbr2;
        for (int p = 0; p < 6; p++) {
            number2 = newPassword[p];
            nmbr2 = number2 - '1';
            newNewPassword[p] = nmbr2;
        }

        System.out.println("New new password: ");
        for (int j = 0; j < newNewPassword.length; j++) {
            System.out.print(newNewPassword[j]);
        }
    }
}