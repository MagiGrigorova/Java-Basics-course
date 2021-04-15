import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hoursResult = 0;
        int minutesResult = 0;


        if (minutes < 45) {
            hoursResult = hours;
            minutesResult = minutes + 15;
        } else {
            if (hours == 23) {
                hours = -1;
            }
            hoursResult = hours + 1;
            minutesResult = Math.abs (minutes - 45);
        }

        System.out.printf("%d:%02d", hoursResult, minutesResult);

    }
}
