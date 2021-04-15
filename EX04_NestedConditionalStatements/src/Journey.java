import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String destination = "";
        double moneySpent = 0.0;
        String placeToStay = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneySpent = budget * 0.3;
                placeToStay = "Camp";
            } else if (season.equals("winter")) {
                moneySpent = budget * 0.7;
                placeToStay = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = budget * 0.4;
                placeToStay = "Camp";
            } else if (season.equals("winter")) {
                moneySpent = budget * 0.8;
                placeToStay = "Hotel";
            }
        } else {
            destination = "Europe";
            moneySpent = budget * 0.9;
            placeToStay = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", placeToStay, moneySpent);

    }
}
