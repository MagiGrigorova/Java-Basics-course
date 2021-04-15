import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double salesVolume = Double.parseDouble(scan.nextLine());

        boolean isValidCity = true;
        boolean isValidSalesVolume = true;
        double commissionPercent = 0.0;

        if (city.equals("Sofia")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                commissionPercent = 0.05;
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                commissionPercent = 0.07;
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                commissionPercent = 0.08;
            } else if (salesVolume > 10000) {
                commissionPercent = 0.12;
            } else {
                isValidSalesVolume = false;
            }
        } else if (city.equals("Varna")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                commissionPercent = 0.045;
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                commissionPercent = 0.075;
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                commissionPercent = 0.10;
            } else if (salesVolume > 10000) {
                commissionPercent = 0.13;
            } else {
                isValidSalesVolume = false;
            }
        } else if (city.equals("Plovdiv")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                commissionPercent = 0.055;
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                commissionPercent = 0.08;
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                commissionPercent = 0.12;
            } else if (salesVolume > 10000) {
                commissionPercent = 0.145;
            } else {
                isValidSalesVolume = false;
            }
        } else {
            isValidCity = false;
        }
        if (!isValidCity || !isValidSalesVolume) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commissionPercent * salesVolume);
        }
    }
}
