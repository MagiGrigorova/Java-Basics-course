import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());

        double price = 0.0;
        double discount = 1;

        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer")) {
            price = 4200;
        } else if (season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }
        if (fishermen <= 6) {
            discount = 0.9;
        } else if (fishermen <= 11) {
            discount = 0.85;
        } else if (fishermen > 12) {
            discount = 0.75;
        }
        double totalPrice = price * discount;

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                totalPrice = totalPrice * 0.95;
        }
        if (budget >= totalPrice) {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeeded = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
        }
    }
}
