import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double clothesPricePerStatist = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;
        double totalClothesPrice = statists * clothesPricePerStatist;

        if (statists > 150) {
            totalClothesPrice = totalClothesPrice * 0.9;
        }
        double totalPrice = decor + totalClothesPrice;

        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            double moneyNeeded = totalPrice - budget;
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        } else {
            System.out.println("Action!");
            double moneyLeft = budget - totalPrice;
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}
