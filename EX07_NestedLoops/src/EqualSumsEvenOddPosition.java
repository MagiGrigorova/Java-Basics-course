import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end ; i++) {
            int evenSum = 0;
            int oddSum = 0;
            boolean isEven = false;
            int number = i;
            while (number > 0) {
                int digit = number % 10;
                if (isEven) {
                    evenSum += digit;
                    isEven = false;
                } else {
                    oddSum += digit;
                    isEven = true;
                }
                number /= 10;                // number = number / 10;
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
