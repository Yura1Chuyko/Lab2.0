package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class StudentList {
    private List<String> subjects;
    private List<Student> students;
    private final HashMap<String, HashMap<String, Integer>> map;

    public StudentList(String[] subjects) {
        this.subjects = new ArrayList(100);
        this.students = new ArrayList(100);
        for (int i = 0; i < subjects.length; i++) {
            this.subjects.add(subjects[i] );
        }
        this.map = new HashMap<>();
        for (String subject : subjects) {
            this.map.put(subject, new HashMap<>());
        }
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setGrade(String subject, String id, int grade) {
        HashMap<String, Integer> innerMap = map.get(subject);
        if (innerMap == null) {
            innerMap = new HashMap<>();
            map.put(subject, innerMap);
        }
        innerMap.put(id, grade);
    }

    public int getGrade(String subject, String id) {
        HashMap<String, Integer> innerMap = map.get(subject);
        if (innerMap == null) {
            innerMap = new HashMap<>();
            map.put(subject, innerMap);
        }
        Integer grade = innerMap.get(id);
        if (grade == null) {
            return 0;
        }
        return (int) grade;
    }

    public Map<String, Integer> getGrades(String subject) {
        return map.get(subject);
    }

    public void showAllGrages() {
        for(Student student: students) {
            System.out.print(student.getId() + ": ");
            for(String subject: subjects) {
                System.out.print(subject + "=" + getGrade(subject, student.getId()) + " ");
            }
            System.out.println();
        }
    }

    private int getStudSum(String id) {
        int result = 0;
        for (String subject : subjects) {
            result += getGrade(subject, id);
        }
        return result;
    }

    public void getBestStudentInfo() {
        final String bestStudentId = getBestStudentId();
        System.out.print(bestStudentId + ": ");
        for (String subject : subjects) {
            System.out.print(subject + "=" + getGrade(subject, bestStudentId) + " ");
        }
        System.out.println();
    }

    public String getBestStudentId() {
        int currentMax = -1;
        Student bestStudent = null;
        for (Student student : students) {
            int currentSum = getStudSum(student.getId());
            if (currentSum > currentMax) {
                currentMax = currentSum;
                bestStudent = student;
            }
        }
        return bestStudent.getId();
    }
}
