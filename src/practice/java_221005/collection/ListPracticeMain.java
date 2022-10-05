package practice.java_221005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2nd likeLion2nd = new LikeLion2nd();
        List<String> students = likeLion2nd.getStudentList();

        for (String student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}