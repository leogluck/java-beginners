package yehor_zharavin.project;

public class DecoderUtil {
    public static char keyToByte(String secretKey) {
        // "01100011" -> 99
        // '1' - '0' = 1
        // '0' - '0' = 0

        int multiplier = 1;
        char key = 0;
        char[] charArray = secretKey.toCharArray();
        for (int index = charArray.length - 1; index >= 0 ; index--){
            key += (charArray[index] - '0') * multiplier;
            multiplier *= 2;
        }

        return key;
    }

    public static void main(String[] args) {
        System.out.println(keyToByte("01101011"));
    }
}
