package danil_yakovenko.finalWork;
import java.util.Scanner;

public class finalWorkLetters {
    public static void main(String[] args) {
        String[] password = new String[6];
        String[] lettersPackage = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        String[] newPassword = new String[6];
        String[] newNewPassword = new String[6];
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (scan.hasNext()) {
            password[i] = String.valueOf(scan.next());
            i++;
            if(i == password.length){
                break;
            }
        }

        for (int b = 0; b < 6; b++) {
            System.out.print(password[b]);
        }

        System.out.println("");

        int h = 0;
        int l = 0;
        String letter;
        String ltr = "";
        while (true) {
            letter = password[h];
            while (h == 6) {
                
            }
            break;
        }


        for (int z = 0; z < 6; z++) {
           System.out.print(newPassword[z]);
        }
    }
}