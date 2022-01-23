package yehor_zharavin.project;

import java.io.FileReader;
import java.io.FileWriter;

public class Decode {
    public static void main(String[] args) {
        System.out.println("Введите секретный ключ:");
        String secretKey = in.nextLine();

        try {
            FileReader fileReader = new FileReader("decoded.txt", false);
            fileReader.read(decodedString);
            fileReader.close();
        } catch (Throwable t) {
            System.out.println(t.getLocalizedMessage());
        }
    }
}
