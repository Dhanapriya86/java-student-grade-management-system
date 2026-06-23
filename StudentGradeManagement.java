import java.util.Scanner;

class Student {

    String name;
    int[] marks = new int[3];

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total / 3.0;
    }

    public String calculateGrade() {
        double average = calculateAverage();

        if (average >= 80) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public void displayReport() {

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Student Name : " + name);

        System.out.print("Marks        : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\nAverage      : " + calculateAverage());
        System.out.println("Grade        : " + calculateGrade());
    }
}

public class StudentGradeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" STUDENT GRADE MANAGEMENT SYSTEM ");
        System.out.println("=================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, marks);

        student.displayReport();

        sc.close();
    }
}
