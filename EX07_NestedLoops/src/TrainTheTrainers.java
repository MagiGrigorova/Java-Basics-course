import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int juryCnt = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double gradeSumOfAllPresentations = 0;
        double counter = 0;

        while (!"Finish".equals(input)) {
            double gradeSum = 0;

            for (int i = 0; i < juryCnt; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                counter++;
                gradeSum += grade;
                gradeSumOfAllPresentations += grade;
            }

            double avgGrade = gradeSum / juryCnt;
            System.out.printf("%s - %.2f.%n", input, avgGrade);

            input = scan.nextLine();
        }
        double avgGradeResult = gradeSumOfAllPresentations / counter;
        System.out.printf("Student's final assessment is %.2f.%n", avgGradeResult);
    }
}
