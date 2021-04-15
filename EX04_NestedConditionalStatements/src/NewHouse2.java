import java.util.Scanner;

public class NewHouse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int flowerQty = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double flowerPrice = 0.0;
        double discount = 1.0;

        if (flower.equals("Roses")) {
            flowerPrice = 5;
            if (flowerQty > 80) {
                discount = 0.9;
            }
        } else if (flower.equals("Dahlias")) {
            flowerPrice = 3.80;
            if (flowerQty > 90) {
                discount = 0.85;
            }
        } else if (flower.equals("Tulips")) {
            flowerPrice = 2.80;
            if (flowerQty > 80) {
                discount = 0.85;
            }
        } else if (flower.equals("Narcissus")) {
            flowerPrice = 3;
            if (flowerQty < 120) {
                discount = 1.15;
            }
        } else if (flower.equals("Gladiolus")) {
            flowerPrice = 2.50;
            if (flowerQty < 80) {
                discount = 1.20;
            }
        }

        double totalPrice =  flowerPrice * flowerQty * discount;
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerQty, flower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
