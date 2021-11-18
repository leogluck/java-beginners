package lesson4;

public class From20To50 {
    public static void main(String[] args) {
        int number = 20;
        boolean ans = true;
        while (ans == true) {
            number++;
            if (number % 5 != 0 && number % 3 == 0) {
                System.out.println(number);
            } else if (number == 50) {
                ans = false;
            }
        }
    }

}
