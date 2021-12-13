package task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 3: 'Class hierarchy'");
        final Student vasyl = new Student("Vasyl");
        final Subject math = new Subject("Math");
        final Mark mark = new Mark();
        mark.setStudent(vasyl);
        mark.setSubject(math);
        mark.setValue(5);
        final Mark mark2 = new Mark("Paul", "English", 4);
        final Mark mark3 = new Mark("Sam","Programming",3);
        final Mark mark1 = new Mark("Yura","Ukrainian Lang",3);
        System.out.println(mark);
        System.out.println(mark2);
        System.out.println(mark3);
        System.out.println(mark1);
    }
}
