package yehor_zharavin.project;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Encoder {
   private final EightBitCipherInterface cipher = new EightBitCipher();

    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.run();
    }

    private void run() {
        System.out.println("Введите текст");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println("Введите секретный ключ:");
        String secretKey = in.nextLine();

        char code = DecoderUtil.keyToByte(secretKey);

        String encodedString = cipher.encode(text, code);

        System.out.println(encodedString);

        try {
            FileWriter fileWriter = new FileWriter("encoded.txt", false);
            fileWriter.write(encodedString);
            fileWriter.close();
        } catch (Throwable t) {
            System.out.println(t.getLocalizedMessage());
        }
    }
}
