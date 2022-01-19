package egor_muchin.Proect;

public class Project {
    /**
     * Попробуй использовать массив dp[] размер которого будет равен количеству ступеней.
     * В ячейках массива будут содержаться количество комбинаций до ступени с номером index (index - индекс ячейки массива)
     * Для реализации рекурсии метод должен вызывать сам себя
     *
     * a b c d e f...
     * f = d + e
     */
    public static void main(String[] args) {
        Project project = new Project();
        project.startRecursion(0);
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
