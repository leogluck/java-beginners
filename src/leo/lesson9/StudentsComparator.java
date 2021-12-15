package leo.lesson9;

import java.util.Comparator;

public class StudentsComparator implements Comparator<IndexedStudent> {
    @Override
    public int compare(IndexedStudent student1, IndexedStudent student2) {
        return Double.compare(student1.getIndex(), student2.getIndex());
    }
}
