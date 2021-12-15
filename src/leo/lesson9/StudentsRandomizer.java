package leo.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsRandomizer {
    List<IndexedStudent> students = new ArrayList<>();

    public static void main(String[] args) {
        StudentsRandomizer randomizer = new StudentsRandomizer();
        randomizer.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student's name:");
            String studentsName = scanner.nextLine();
            if (studentsName.isEmpty()) {
                break;
            }
            IndexedStudent student = new IndexedStudent(studentsName);
            students.add(student);
        }

        for (int i = 0; i < students.size(); i++) {
            double index = Math.random();
            students.get(i).setIndex(index);
            System.out.println(students.get(i).getName() + " " + students.get(i).getIndex());
        }

        System.out.println("............................................");
        System.out.println("............................................");

        students.sort(new StudentsComparator());

        for (IndexedStudent student: students) {
            System.out.println(student.getName() + " " + student.getIndex());
        }
    }
}
