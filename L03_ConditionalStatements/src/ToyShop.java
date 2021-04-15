import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzleCnt = Integer.parseInt(scan.nextLine());
        int talkingDollCnt = Integer.parseInt(scan.nextLine());
        int teddyBearCnt = Integer.parseInt(scan.nextLine());
        int minionsCnt = Integer.parseInt(scan.nextLine());
        int trucksCnt = Integer.parseInt(scan.nextLine());

        double puzzleTotalPrice = puzzleCnt * 2.60;
        double talkingDollTotalPrice = talkingDollCnt * 3;
        double teddyBearTotalPrice = teddyBearCnt * 4.10;
        double minionsTotalPrice = minionsCnt * 8.20;
        double trucksTotalPrice = trucksCnt * 2;

        double totalPrice = puzzleTotalPrice + talkingDollTotalPrice + teddyBearTotalPrice + minionsTotalPrice + trucksTotalPrice;
        int totalToyCnt = puzzleCnt + talkingDollCnt + teddyBearCnt + minionsCnt + trucksCnt;

        if (totalToyCnt >= 50) {
            totalPrice =  totalPrice * 0.75; // totalPrice - totalPrice*0.25
        }

        double finalPrice = totalPrice * 0.9; // totalPrice - totalPrice*0.10

        // double diff = Math.abs(finalPrice - excursionPrice);  ---> // взимаме абсолютната стойност на разликата между двете суми

        if (finalPrice >= excursionPrice) {
            double moneyLeft = finalPrice - excursionPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);       // тук променливата щеше да е diff
        } else {
            double moneyNeeded = excursionPrice - finalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);   // тук променливата щеше да е diff
        }
    }
}
