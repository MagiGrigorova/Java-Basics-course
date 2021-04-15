import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scan.nextLine());
        //        На конзолата се отпечатват два реда:
        // •	"The final price is: {крайна цена на услугата} lv."
        // •	"The discount is: {отстъпка} lv."
        //        И двете суми трябва да бъдат форматирани до втората цифра след десетичния знак.

        double priceTobePaidWithoutDiscount = squareMeters * 7.61;
        double discount = priceTobePaidWithoutDiscount * 0.18;
        double totalPrice = priceTobePaidWithoutDiscount - discount;

        System.out.printf("The final price is: %.2f lv.%n", totalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
