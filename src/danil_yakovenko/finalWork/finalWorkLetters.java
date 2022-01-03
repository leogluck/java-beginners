package danil_yakovenko.finalWork;
import java.util.Scanner;

public class finalWorkLetters {
    public static void main(String[] args) {
        char[] password = new char[6];
        char[] lettersPackage = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        String newPassword;
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (scan.hasNext()) {
            password[i] = scan.next().toCharArray()[0];
            i++;
            if(i == password.length){
                break;
            }
        }

        for (int b = 0; b < 6; b++) {
            System.out.print(password[b]);
        }

        System.out.println("");

        String letter;
        StringBuilder ltr = new StringBuilder();
        for (int h = 0; h < password.length; h++) {
            int l = 0;
            while (password[h] != lettersPackage[l++]) {
            }
            ltr.append(lettersPackage[l]);
        }
        newPassword = ltr.toString();

        System.out.print(newPassword);
    }
}