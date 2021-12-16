package sabetskyi_stanislav.hometask5;

public class Average10 {
    public static void main(String[] args) {
        int[] numbs = new int[10];
        {
            numbs[0] = 12;
            numbs[1] = 7;
            numbs[2] = 400;
            numbs[3] = 10;
            numbs[4] = 5;
            numbs[5] = 25;
            numbs[6] = 14;
            numbs[7] = 100;
            numbs[8] = 1;
            numbs[9] = 500;
        }
        int sum = 0;
        int x=-1;
        boolean count=true;
        while (count==true){
            x++;
            sum=numbs[x]+sum;
            System.out.println("Sum is "+sum);
            if (x> numbs.length-2){
                count=false;
            }
            else {
                continue;
            }
        }
        int average;
        average=sum/ numbs.length;
        System.out.println("Average number is "+average);

    }
}
