package lesson5;


public class Smallest10 {

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
        int minimum = 13;
        boolean count = true;
        int x = 0;
        while (count == true) {
            x++;
            if (numbs[x] < minimum) {
                minimum = numbs[x];
                System.out.println("Minimum is " + minimum);
            } else if (x == 9) {
                count = false;
            } else {
                continue;
            }
        }
        System.out.println("The Smallest number is "+minimum);
    }

}




