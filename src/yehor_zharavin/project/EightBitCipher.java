package yehor_zharavin.project;

public class EightBitCipher {
    public static void main(String[] args) {


    }

    // 1. Написать функцию считывания текста

    // 2. написать функцию превращения текста в массив символов (char[])

    // 3. написать функцию считывания секретного ключа (считать ключ как текст 00101101)

    // 4. придумать функцию конвертации строки секретного ключа в тип данных int

    private static char xor(char c1, char c2) {
        return (char) (c1 ^ c2);
    }
}
