import java.util.Scanner;

public class EqualSumsEvenOddPosition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
//        int start = Integer.parseInt(scan.nextLine());
//        int end = Integer.parseInt(scan.nextLine());
//
//        for (int i = start; i <= end ; i++) {
//            int evenSum = 0;
//            int oddSum = 0;
//            String number = String.valueOf(i);
//
//            for (int digitIndex = 0; digitIndex < number.length(); digitIndex++) {
//                if (digitIndex % 2 == 0) {
//                    evenSum += Character.getNumericValue(number.charAt(digitIndex));
//                } else {
//                    oddSum += (number.charAt(digitIndex) - '0');
//                }
//            }
//            if (oddSum == evenSum) {
//                System.out.print(i + " ");
//            }
//        }