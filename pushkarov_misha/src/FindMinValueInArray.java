public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 0, 10};
        int isThisMinNum = myArray[0];

        for (int num : myArray) {
            if (num < isThisMinNum) {
                isThisMinNum = num;
            }
        }
        System.out.println(isThisMinNum);
    }
}
