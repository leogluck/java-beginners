package workshop1;

public class Ex2 {
    public static void main(String[] args) {
        Integer i1 = 128;

        Integer i2 = 128;

        Integer i5 = new Integer(128);

        System.out.println(i1 == i2 && i1 == i5 && i2 == i5);

        Integer i3 = 127;

        Integer i4 = 127;

        System.out.println(i3 == i4);
    }
}
