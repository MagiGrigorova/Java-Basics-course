import java.util.Scanner;

public class PreparationForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxFailCount = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();

        int totalGradeScore = 0;
        int currentFailCount = 0;
        int gradeCount = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());
            totalGradeScore += grade;
            gradeCount++;
            lastProblem = input;

            if (grade <= 4) {
                currentFailCount++;
                if (currentFailCount == maxFailCount) {
                    break;
                }
            }

            input = scan.nextLine();
        }

        double avgScore = 1.0 * totalGradeScore / gradeCount;

        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", avgScore, gradeCount, lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", currentFailCount);

        }
    }
}
