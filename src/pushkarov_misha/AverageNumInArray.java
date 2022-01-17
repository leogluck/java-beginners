package pushkarov_misha;

public class AverageNumInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 0, 10};
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}
