package workshop1;

public class Ex1 {
    static int a = 1111;

    static {
        System.out.println("static");
        a = a-- - --a;
    }

    {
        System.out.println("non static");
        a = a++ - ++a;
    }

    public static void main(String[] args) {
        System.out.println(a);

        Ex1 object = new Ex1();

        System.out.println(a);
    }
}
