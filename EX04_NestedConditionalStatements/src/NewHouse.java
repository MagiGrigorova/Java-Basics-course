import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int flowerQty = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double flowerPrice = 0.0;
        double totalPrice = 0.0;

        if (flower.equals("Roses")) {
            flowerPrice = 5;
            if (flowerQty > 80) {
                totalPrice =  flowerPrice * flowerQty * 0.9;
            } else {
                totalPrice = flowerPrice * flowerQty;
            }
        } else if (flower.equals("Dahlias")) {
            flowerPrice = 3.80;
            if (flowerQty > 90) {
                totalPrice = flowerPrice * flowerQty * 0.85;
            } else {
                totalPrice = flowerPrice * flowerQty;
            }
        } else if (flower.equals("Tulips")) {
            flowerPrice = 2.80;
            if (flowerQty > 80) {
                totalPrice = flowerPrice * flowerQty * 0.85;
            } else {
                totalPrice = flowerPrice * flowerQty;
            }
        } else if (flower.equals("Narcissus")) {
            flowerPrice = 3;
            if (flowerQty < 120) {
                totalPrice = flowerPrice * flowerQty * 1.15;
            } else {
                totalPrice = flowerPrice * flowerQty;
            }
        } else if (flower.equals("Gladiolus")) {
            flowerPrice = 2.50;
            if (flowerQty < 80) {
                totalPrice = flowerPrice * flowerQty * 1.20;
            } else {
                totalPrice = flowerPrice * flowerQty;
            }
        }
        //•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
         if (budget >= totalPrice) {
             double moneyLeft = budget - totalPrice;
             System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerQty, flower, moneyLeft);
         } else {
             double moneyNeeded = totalPrice - budget;
             System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
         }
    }
}
