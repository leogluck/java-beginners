package leo.lesson5;

public class BreakOperatorExample {
    public static void main(String[] args) {
        int age = 10;

        while (true) {
            System.out.println("Your age is: " + age);
            if (age >= 18) {
                break;
            }
            age++;
        }

        System.out.println("You can come inside");
    }
}
