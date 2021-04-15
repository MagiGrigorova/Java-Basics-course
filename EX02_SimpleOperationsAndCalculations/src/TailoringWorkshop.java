import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tables = Integer.parseInt(scan.nextLine());              // 5
        double tableLength = Double.parseDouble(scan.nextLine());    // 1,00
        double tableWidth = Double.parseDouble(scan.nextLine());     // 0,50

        // Общата площ на покривките е:
        //5 броя * (1.00 + 2 * 0.30) * (0.5 + 2 * 0.30) = 8.80 кв. метра
        //Общата площ на каретата  е:
        // 5 броя * (1.00 /2 ) * (1.00 / 2) = 1.25 кв. метра
        //Цена в долари: 8.80 * 7 долара + 1.25 * 9 долара = 72.85 долара
        //Цена в левове: 72.85 * 1.85 = 134.77 лева

        double area = tables * (tableLength + 2 * 0.3) * (tableWidth + 2 * 0.3);

        double side = tableLength/2;
        double squareCoverCloth = side * side * tables;

        double coversPriceinUSD = area * 7;
        double squreCoverPriceinUSD = squareCoverCloth * 9;

        double priceInUSD = coversPriceinUSD + squreCoverPriceinUSD;
        double priceInBGN = priceInUSD * 1.85;
        System.out.printf("%.2f USD", priceInUSD);
        System.out.println();
        System.out.printf("%.2f BGN", priceInBGN);
    }
}
