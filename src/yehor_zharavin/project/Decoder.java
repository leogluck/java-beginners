package yehor_zharavin.project;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Decoder {
    private final EightBitCipherInterface cipher = new EightBitCipher();

    public static void main(String[] args) {
       Decoder decoder = new Decoder();
       decoder.run();
    }

    private void run(){
        System.out.println("Введите секретный ключ:");
        Scanner in = new Scanner(System.in);
        String secretKey = in.nextLine();
        char code = DecoderUtil.keyToByte(secretKey);
        String decodedString = "";

        try {
            decodedString = Files.readString(Path.of("encoded.txt"));
        } catch (Throwable t) {
            System.out.println(t.getLocalizedMessage());
        }

        String encodedText = cipher.decode(decodedString.substring(0, decodedString.length()), code);
        System.out.println(encodedText);
    }
}
