import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int timeInSeconds1 = Integer.parseInt(scan.nextLine());
        int timeInSeconds2 = Integer.parseInt(scan.nextLine());
        int timeInSeconds3 = Integer.parseInt(scan.nextLine());

        int totalTimeInSeconds = timeInSeconds1 + timeInSeconds2 + timeInSeconds3;

        int minutes = totalTimeInSeconds / 60;
        int seconds = totalTimeInSeconds % 60;

        // System.out.printf(“%d:%02d”, minutes, seconds”)

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
