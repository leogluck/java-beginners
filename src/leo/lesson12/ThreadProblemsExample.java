package leo.lesson12;

public class ThreadProblemsExample {
    private int index;
    private static final int MAX_CYCLE_RANGE = 10_000;

    public static void main(String[] args) {
        ThreadProblemsExample example = new ThreadProblemsExample();
        example.runProgram();
    }

    private void incrementIndexCycle() {
        for (int i = 0; i < MAX_CYCLE_RANGE; i++) {
            index++;
        }
    }

    private void runProgram() {
        Thread firstThread = new Thread() {
            @Override
            public void run() {
                incrementIndexCycle();
            }
        };

        Thread secondThread = new Thread() {
            @Override
            public void run() {
                incrementIndexCycle();
            }
        };

        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(index);
    }
}
