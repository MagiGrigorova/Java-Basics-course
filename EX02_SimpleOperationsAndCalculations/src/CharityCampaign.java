import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int bakers = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakesProfit = cakes * 45;
        double waffleProfit = waffles * 5.80;
        double pancakesProfit = pancakes * 3.20;

        double profitPerDayByOne = cakesProfit + waffleProfit + pancakesProfit;
        double profitPerDayByAll = profitPerDayByOne * bakers;

        double totalProfit = profitPerDayByAll * days;
        double expenses = totalProfit / 8;

        double finalProfit = totalProfit - expenses;

        System.out.printf("%.2f", finalProfit);
    }
}
