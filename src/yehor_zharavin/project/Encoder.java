package yehor_zharavin.project;

import java.util.Scanner;

public class Encoder {
   private EightBitCipherInterface cipher;

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

        byte code = DecoderUtil.keyToByte(secretKey);

        String encodedString = cipher.encode(text, code);

        System.out.println(encodedString);
    }
}
