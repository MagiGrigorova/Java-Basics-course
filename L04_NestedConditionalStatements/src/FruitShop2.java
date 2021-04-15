import java.util.Scanner;

public class FruitShop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double qty = Double.parseDouble(scan.nextLine());

        double price = 0;
        boolean isValidFruit = true;
        boolean isValidDay = true;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if ("banana".equals(fruit)) {
                price = 2.50;
            } else if ("apple".equals(fruit)) {
                price = 1.20;
            } else if ("orange".equals(fruit)) {
                price = 0.85;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.45;
            } else if ("kiwi".equals(fruit)) {
                price = 2.70;
            } else if ("pineapple".equals(fruit)) {
                price = 5.50;
            } else if ("grapes".equals(fruit)) {
                price = 3.85;
            } else {
                isValidFruit = false;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                isValidFruit = false;
            }
        } else {
            isValidDay = false;
        }
        if (!isValidFruit || !isValidDay) {
            System.out.println("error");
        } else {
            price = price * qty;
            System.out.println(price);
        }
    }
}
