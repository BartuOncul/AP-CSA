import java.util.Scanner;

public class ScoreReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the number of students:");
        int numStudents = input.nextInt();

        System.out.println("Enter " + numStudents + " scores.");
        int[] scores = new int[numStudents];

        // Input scores for all students
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // Calculate grades and display results
        for (int i = 0; i < scores.length; i++) {
            String grade;

            if (scores[i] >= 90) {
                grade = "A";
            } else if (scores[i] >= 80) {
                grade = "B";
            } else if (scores[i] >= 70) {
                grade = "C";
            } else if (scores[i] >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }
}
