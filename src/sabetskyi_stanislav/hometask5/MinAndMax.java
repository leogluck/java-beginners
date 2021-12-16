package sabetskyi_stanislav.hometask5;

public class MinAndMax {
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
        int maximum = 13;
        int minimum = 13;
        boolean count = true;
        int x = 0;
        while (count == true) {
            if (numbs[x] < minimum) {
                minimum = numbs[x];
            } else if (x > numbs.length - 2) {
                count = false;
            } else {
                x++;
                continue;
            }
        }
        System.out.println("The Smallest number is " + minimum);
        int i = 0;
        boolean count2 = true;
        while (count2 == true) {
            if (numbs[i] > maximum) {
                maximum = numbs[i];
            } else if (i > numbs.length - 2) {
                count2 = false;
            } else {
                i++;
                continue;
            }
        }
        System.out.println("The Biggest number is " + maximum);
        int sum;
        sum = maximum + minimum;
        System.out.println("Sum of bigest and smallest numbers is " + sum);
    }
}
