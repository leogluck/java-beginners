import java.util.Scanner;


public class Home_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Какова цена товара?:");
        int x = in.nextInt();
        if (x>=0){
            if(x<=100) {
                System.out.println("Скидка на товар отсуцтвует!");
            }
        }
        if (x>=101){
            if(x<=200) {
                System.out.println("Скидка на товар составляет: 2%!");
            }
        }
        if (x>=201){
                System.out.println("Скидка на товар составляет: 5%!");

        }







    }
}
