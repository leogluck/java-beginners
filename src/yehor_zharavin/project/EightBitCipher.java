package yehor_zharavin.project;

public class EightBitCipher implements EightBitCipherInterface {
    public static void main(String[] args) {


    }

    // TODO 1. Реализовать тут методы интерфейса EightBitCipherInterface

    // TODO 2. написать функцию превращения текста в массив символов (char[]) (в методе encode())

    // TODO 3. продумать реализацию метода encode(). Добавить перебор элементов строки в этом методе

    private static char xor(char c1, char c2) {
        return (char) (c1 ^ c2);
    }
}
