package leo.lesson12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadExampleRunner implements ActionListener {
    private SimpleGui simpleGui;
    private static final long DELAY = 5_000;

    public static void main(String[] args) {
        ThreadExampleRunner threadExampleRunner = new ThreadExampleRunner();
        threadExampleRunner.showGui();
    }

    private void showGui() {
        simpleGui = new SimpleGui(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double random = calculateRandomNumber();
        simpleGui.setValueText(String.valueOf(random));
//        calculateRandomNumberAsync();
    }

    private double calculateRandomNumber() {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Math.random();
    }

    private void calculateRandomNumberAsync() {
        Thread calcThread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                double rnd = Math.random();
                simpleGui.setValueText(String.valueOf(rnd));
            }
        };
        calcThread.start();
    }
}
