import java.util.Scanner;

public class GradeCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Student Grade Calculator -----");

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            // validation
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--; // repeat same subject
                continue;
            }

            sum += marks;
        }

        double average = (double) sum / subjects;
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
            grade = "F (Fail)";
        }

        System.out.println("\nTotal Marks: " + sum);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}