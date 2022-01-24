package yehor_zharavin.project;

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
        return new String(encodedArray);
    }

    @Override
    public String decode(String encodedText, char code) {
        char[] textArray = encodedText.toCharArray();
        char[] decodedArray = new char[textArray.length];

        char firstNotDecodedChar = textArray[0];
        decodedArray[0] = xor(firstNotDecodedChar, code);

        for (int i = 1; i < textArray.length; i++) {
            char char1 = decodedArray[i - 1];
            char char2 = textArray[i];
            decodedArray[i] = xor(char1, char2);
        }
        return new String(decodedArray);
    }

    private char xor(char c1, char c2) {
        return (char) (c1 ^ c2);
    }
}
