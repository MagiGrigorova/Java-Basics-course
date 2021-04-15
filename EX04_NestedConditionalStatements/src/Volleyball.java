import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yearType = scan.nextLine();
        int holidaysCnt = Integer.parseInt(scan.nextLine());
        int weekendsInHomeCityCnt = Integer.parseInt(scan.nextLine());

        int weekendsInSofiaCnt = 48 - weekendsInHomeCityCnt;
        double volleyballOnSaturdays = weekendsInSofiaCnt * 3 * 1.0 / 4;
        double volleyballOnWeekends = volleyballOnSaturdays + weekendsInHomeCityCnt;
        double volleyballOnHolidays = holidaysCnt * 2 * 1.0 / 3;
        double volleyballGamesTotal = volleyballOnHolidays + volleyballOnWeekends;

        if (yearType.equals("leap")) {
            volleyballGamesTotal *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(volleyballGamesTotal));

    }
}
