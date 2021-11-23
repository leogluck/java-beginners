package pushkarov_misha;

public class MoreAboutCycleFor2 {
    public static void main(String[] args) {
        for (int i = 35; i <= 87; i++) {
            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
                System.out.println(i);
            }
        }
    }
}
