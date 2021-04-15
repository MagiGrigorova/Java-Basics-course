import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());

        double rest = Math.floor(input * 100);               // int rest = (int)(input*100) - кастване - превръщане от "double" в "int"
        int coinsCount = 0;

        while (rest > 0) {
            if (rest - 200 >= 0) {
                coinsCount++;
                rest -= 200;
            } else if (rest - 100 >= 0) {
                coinsCount++;
                rest -= 100;
            } else if (rest - 50 >= 0) {
                coinsCount++;
                rest -= 50;
            } else if (rest - 20 >= 0) {
                coinsCount++;
                rest -= 20;
            } else if (rest - 10 >= 0) {
                coinsCount++;
                rest -= 10;
            } else if (rest - 5 >= 0) {
                coinsCount++;
                rest -= 5;
            } else if (rest - 2 >= 0) {
                coinsCount++;
                rest -= 2;
            } else if (rest - 1 >= 0) {
                coinsCount++;
                rest -= 1;
            }
        }
        System.out.println(coinsCount);
    }
}
