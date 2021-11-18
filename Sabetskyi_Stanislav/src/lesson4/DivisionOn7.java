package lesson4;

public class DivisionOn7 {
    public static void main(String[] args) {
        int number =35;
        boolean ans=true;
        while(ans==true){
            number++;
            if (number%7==1||number%7==5||number%7==2){
                System.out.println(number);
            }
            else if (number==87){
                ans=false;
            }
            else{
                continue;
            }
        }
    }
}
