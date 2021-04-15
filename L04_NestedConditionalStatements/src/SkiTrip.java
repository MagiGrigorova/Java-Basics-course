import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysCnt = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String feedback = scan.nextLine();

        int nightsCount = daysCnt - 1;

        double price = 0;

        if ("room for one person".equals(roomType)) {
            price = 18;
        } else if ("apartment".equals(roomType)) {
            price = 25;
            if (nightsCount < 10) {
                price = price * 0.7;
            } else if (nightsCount < 15) {
                price = price * 0.65;
            } else {
                price = price * 0.5;
            }
        } else if ("president apartment".equals(roomType)) {
            price = 35;
            if (nightsCount < 10) {
                price = price * 0.9;
            } else if (nightsCount < 15) {
                price = price * 0.85;
            } else {
                price = price * 0.8;
            }
        }

        double totalPrice = price * nightsCount;

        if (feedback.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else {
            totalPrice = totalPrice * 0.9;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
