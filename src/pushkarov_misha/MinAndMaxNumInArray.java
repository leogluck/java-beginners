package pushkarov_misha;

public class MinAndMaxNumInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, -22, 5, 6, 7, -2^2, 2, 10};
        int minNumInArr = myArray[0];
        int maxNumInArr = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (minNumInArr > myArray[i]) {
                minNumInArr = myArray[i];
            }
            if (minNumInArr < myArray[i]) {
                maxNumInArr = myArray[i];
            }
        }

        System.out.println(minNumInArr);
        System.out.println(maxNumInArr);
    }
}
