import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sumEvenI = 0;
        int sumOddI = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sumEvenI = sumEvenI + currentNumber;
            } else {
                sumOddI = sumOddI + currentNumber;
            }
        }
        if (sumEvenI == sumOddI) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEvenI);
        } else {
            int diff = Math.abs(sumEvenI - sumOddI);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
