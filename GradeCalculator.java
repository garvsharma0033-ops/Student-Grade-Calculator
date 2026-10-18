import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("    STUDENT GRADE CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Number of subjects must be greater than zero.");
            sc.close();
            return;
        }

        double totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            double marks;

            while (true) {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                marks = sc.nextDouble();

                if (marks >= 0 && marks <= 100) {
                    break;
                }

                System.out.println("Invalid marks! Enter a value between 0 and 100.");
            }

            totalMarks += marks;
        }

        double average = totalMarks / subjects;
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else if (average >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("\n================================");
        System.out.println("       STUDENT RESULT");
        System.out.println("================================");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks + " / " + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        if (average >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
