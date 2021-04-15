import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filmName = scan.nextLine();
        int studentCnt = 0;
        int standardCnt = 0;
        int kidCnt = 0;

        while (!"Finish".equals(filmName)) {
            int capacity = Integer.parseInt(scan.nextLine());
            int ticketCounter = 0;
            for (int i = 0; i < capacity; i++) {
                String ticketType = scan.nextLine();
                if ("End".equals(ticketType)) {
                    break;
                }
                ticketCounter++;
                switch (ticketType) {
                    case "student":
                        studentCnt++;
                        break;
                    case "standard":
                        standardCnt++;
                        break;
                    case "kid":
                        kidCnt++;
                        break;
                }
            }
            double percent = ticketCounter * 1.0 / capacity * 100;
            System.out.printf("%s - %.2f%% full.%n", filmName, percent);
            filmName = scan.nextLine();
        }

        int totalTickets = kidCnt + standardCnt + studentCnt;
        double studentPercent = studentCnt * 1.0 / totalTickets * 100;
        double standardPercent = standardCnt * 1.0 / totalTickets * 100;
        double kidPercent = kidCnt * 1.0 / totalTickets * 100;

        System.out.printf("Total tickets: %d%n" +
                "%.2f%% student tickets.%n" +
                "%.2f%% standard tickets.%n" +
                "%.2f%% kids tickets.%n", totalTickets, studentPercent, standardPercent, kidPercent);
    }
}
