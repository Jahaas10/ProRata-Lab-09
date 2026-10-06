import java.util.Scanner;

public class IT25102586Lab9Q4 {

    // Part a: Calculate final mark (30% Assignment + 70% Exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // Part b: Determine grade based on final mark
    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Part c: Print student details
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s | %-10.2f | %-5s\n", name, finalMark, grade);
    }

    // Part d: Main method to execute flow
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();

            finalMarks[i] = calcFinalMark(assignMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

        System.out.printf("%-10s | %-10s | %-5s\n", "Name", "Final Mark", "Grade");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}