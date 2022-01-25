package danil_yakovenko;

public class Ht {
    public static void main(String[] args) {
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double c = Math.random() * 10;
        double abc = (a + b * c / 2);

        System.out.println(abc);
    }

    public static void second(String[] args) {
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double a2 = a * a;
        double b2 = b * b;
        double ab = (a2 + b2) / 2;

        System.out.println(ab);
    }

    public static void third(String[] args) {
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double c = Math.random() * 10;
        double abc = ((a + b) / 12 * c % 4 + b);

        System.out.println(abc);
    }

    public static void fourth(String[] args) {
        double a = Math.random() * 10;
        double b = Math.random() * 10;
        double c = Math.random() * 10;
        double abc = (a - b * c) / (a + b) % c;

        System.out.println(abc);
    }
}
