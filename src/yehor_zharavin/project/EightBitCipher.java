package yehor_zharavin.project;

import java.util.Arrays;

public class EightBitCipher implements EightBitCipherInterface {
    @Override
    public String encode(String text, char code) {
        char[] textArray = text.toCharArray();
        char[] encodedArray = new char[textArray.length];

        for (int i = textArray.length - 1; i > 0; i--){
            char char1 = textArray[i - 1];
            char char2 = textArray[i];
            encodedArray[i] = xor(char1, char2);
        }

        char lastNotEncodedChar = textArray[0];
        encodedArray[0] = xor(lastNotEncodedChar, code);
        return Arrays.toString(encodedArray);
    }

    @Override
    public String decode(String encodedText, char code) {
        char[] textArray = text.toCharArray();
        char[] encodedArray = new char[textArray.length];

        char lastNotEncodedChar = textArray[0];
        encodedArray[0] = xor(lastNotEncodedChar, code);

        for (int i = textArray.length - 1; i < 0; i++){
            char char1 = textArray[i - 1];
            char char2 = textArray[i];
            encodedArray[i] = xor(char1, char2);
        return Arrays.toString(decodedArray);
    }

    // TODO 1. Реализовать тут методы интерфейса EightBitCipherInterface

    // TODO 2. написать функцию превращения текста в массив символов (char[]) (в методе encode())

    // TODO 3. продумать реализацию метода encode(). Добавить перебор элементов строки в этом методе

    private char xor(char c1, char c2) {
        return (char) (c1 ^ c2);
    }
}
