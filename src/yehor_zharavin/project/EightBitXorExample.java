package yehor_zharavin.project;

public class EightBitXorExample {
    public static void main(String[] args) {
        /**
         *  For int values in bin representation: 3 is 0011, 8 is 1000
         *  0011 ^ 1000 = 1011
         *  in int representation 1011 is 11 (1*2^0 + 1*2^1 + 0*2^2 + 1*2^3 = 1*1 + 1*2 + 0*4 + 1*8 = 11)
         *
         *  235 = 5*10^0 + 3*10^1 + 2*10^2
         */

        int a = 3;
        int b = 8;

        if ((a == 3) ^ (b == 8)) {
            System.out.println("GG");
        }

        int c = a ^ b;
        char cChar1 = (char) (a ^ b);

        System.out.println("Integer result of a ^ b = " + c);
        System.out.println("Char result of a ^ b = " + cChar1);

        char a1 = '3';
        char b2 = '8';

        char c2 = (char) (a1 ^ b2);

        System.out.println("Char result of \"a\" ^ \"b\" = " + c2);
    }
}
