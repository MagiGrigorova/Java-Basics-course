import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMins = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMins = Integer.parseInt(scan.nextLine());

        int examTimeInMins = examHour * 60 + examMins;  // 570
        int arrivalTimeInMins = arrivalHour * 60 + arrivalMins;  // 590

        int result = arrivalTimeInMins - examTimeInMins; // 590 - 570 = 20

        if (result > 0) {
            System.out.println("Late");
            if (result < 60) {
                System.out.printf("%d minutes after the start", result);
            } else {
                int hours = result / 60;
                int mins = result % 60;
                System.out.printf("%d:%02d hours after the start", hours, mins);
            }
        } else if (result >= -30) {
            System.out.println("On time");
            if (result != 0) {
                System.out.printf("%d minutes before the start", Math.abs(result));
            }
        } else {
            System.out.println("Early");
            if (result > -60) {
                System.out.printf("%d minutes before the start", Math.abs(result));
            } else {
                int hours = Math.abs(result / 60);
                int mins = Math.abs(result % 60);
                System.out.printf("%d:%02d hours before the start", hours, mins);
            }
        }

    }
}
