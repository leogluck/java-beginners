package danil_yakovenko.finalWork;
import java.util.Scanner;



public class finalWork {
    public static void main(String[] args){
        int[] password = new int[6];
        int[] newPassword = new int[6];
        int[] newNewPassword = new int[6];
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while(scan.hasNextInt()){
            password[i] = scan.nextInt();
            i++;
            if(i == 6){
                break;
            }
        }

        int h = 0;
        int number;
        int nmbr;
        while (true) {
            number = password[h];
            nmbr = number + '1';
            newPassword[h] = nmbr;
            h++;
            if (h == 6){
                break;
            }
        }

        System.out.println("New password: ");
        for (int b = 0; b < newPassword.length; b++) {
            System.out.print(newPassword[b]);
        }

        System.out.println(" ");

        int p = 0;
        int number2;
        int nmbr2;

        while (true) {
            number2 = newPassword[p];
            nmbr2 = number2 - '1';
            newNewPassword[p] = nmbr2;
            p++;
            if (p == 6){
                break;
            }
        }

        System.out.println("New new password: ");
        for (int j = 0; j < newNewPassword.length; j++) {
            System.out.print(newNewPassword[j]);
        }
    }
}


