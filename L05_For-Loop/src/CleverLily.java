import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        int pricePerToy = Integer.parseInt(scan.nextLine());

        int toysQty = 0;
        double lilysMoney = 0.0;
        int moneyForBDay = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                lilysMoney = lilysMoney + moneyForBDay - 1;
                moneyForBDay = moneyForBDay + 10;
            } else {
                toysQty++;    // toysQty = toysQty + 1
            }
        }
        double moneyFromToys = toysQty * pricePerToy;
        lilysMoney = lilysMoney + moneyFromToys;

        if (lilysMoney >= washingMachinePrice) {
            double moneyLeft = lilysMoney - washingMachinePrice;
            System.out.printf("Yes! %.2f", moneyLeft);
        } else {
            double moneyNeed = washingMachinePrice - lilysMoney;
            System.out.printf("No! %.2f", moneyNeed);
        }
    }
}
