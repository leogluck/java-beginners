package egor_muchin.Proect;

import java.util.Scanner;

public class Project {
    /**
     * Попробуй использовать массив dp[] размер которого будет равен количеству ступеней.
     * В ячейках массива будут содержаться количество комбинаций до ступени с номером index (index - индекс ячейки массива)
     * Для реализации рекурсии метод должен вызывать сам себя
     * <p>
     * a b c d e f...
     * f = d + e
     */
    public static void main(String[] args) {
        Project project = new Project();
        project.runProgram();
    }

    private void runProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите количество ступеней в лестнице:");
        int numberOfStares = scanner.nextInt();
        long startTimestamp = System.currentTimeMillis();
        long numberOfCombinations = calculateCombinations(numberOfStares);
        System.out.println("Вы можете подняться на лестницу из " + numberOfStares + " ступеней " + numberOfCombinations + " способами");
        long endTimestamp = System.currentTimeMillis();
        long calculationTime = endTimestamp - startTimestamp;
        System.out.println("Время вычислений: " + calculationTime + "ms");
    }

    private long calculateCombinations(int numberOfStares) {
        long[] dp = new long[numberOfStares + 1];
        return recursiveCalc(dp, numberOfStares);
    }

    private long recursiveCalc(long[] dp, int stareNumber) {
        if (stareNumber <= 2) return stareNumber;
        if (dp[stareNumber] != 0) return dp[stareNumber];

        dp[stareNumber] = recursiveCalc(dp, stareNumber - 1) + recursiveCalc(dp, stareNumber - 2);
        return dp[stareNumber];
    }

    private void startRecursion(int i) {
        if (i == 1000) {
            System.out.println(i);
            return;
        }
        int next = i + 1;
        startRecursion(next);
    }
}
