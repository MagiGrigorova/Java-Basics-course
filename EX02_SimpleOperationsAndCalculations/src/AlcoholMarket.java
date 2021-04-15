import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerQuantity = Double.parseDouble(scan.nextLine());
        double wineQuantity = Double.parseDouble(scan.nextLine());
        double rakiaQuantity = Double.parseDouble(scan.nextLine());
        double whiskeyQuantity = Double.parseDouble(scan.nextLine());

        double rakiaPrice = whiskeyPrice*0.5;
        double winePrice = rakiaPrice*0.6;
        double beerPrice = rakiaPrice*0.2;

        double totalPrice = (whiskeyPrice * whiskeyQuantity) +
                (beerPrice * beerQuantity) +
                (winePrice * wineQuantity) +
                (rakiaPrice * rakiaQuantity);

        System.out.printf("%.2f",totalPrice);
    }
}
