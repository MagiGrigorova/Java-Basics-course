import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nightsQty = Integer.parseInt(scan.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;
        double discountStudio = 1;
        double discountApartment = 1;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (nightsQty > 7 && nightsQty <= 14) {
                discountStudio = 0.95;
            } else if (nightsQty > 14) {
                discountStudio = 0.7;
                discountApartment = 0.9;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (nightsQty > 14) {
                discountStudio = 0.8;
                discountApartment = 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
            if (nightsQty > 14) {
                discountApartment = 0.9;
            }
        }
        double totalPriceApartment = nightsQty * priceApartment * discountApartment;
        double totalPriceStudio = nightsQty * priceStudio * discountStudio;

        System.out.printf("Apartment: %.2f lv.%n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
