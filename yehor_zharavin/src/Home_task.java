import java.util.Scanner;

public class Home_task {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
          System.out.print("Задайте значение числу a:");
        int a = in.nextInt();
          System.out.print("Задайте значение числу b:");
        int b = in.nextInt();
          System.out.print("Задайте значение числу c:");
        int c = in.nextInt();



        if(a>b){
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }
        if(a>b){
            if(a>c){
                System.out.println("a>c");
                System.out.println("a-Самое большое число");
            } else {
                System.out.println("a<c");
                System.out.println("c-Самое большое число");
            }
        }
        if(a<b){
      if(b>c){
          System.out.println("b>c");
          System.out.println("b-Самое большое число");
      }else{
          System.out.println("b<c");
          System.out.println("c-Самое большое число");
      }
        }




    }
}
