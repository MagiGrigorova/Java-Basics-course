import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scan.nextLine());
        int finalNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int combinations = 0;
        boolean flag = false;

        for (int i = startingNumber; i <= finalNumber; i++) {
            for (int j = startingNumber; j <= finalNumber ; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, i, j, magicNumber);
                    flag = true;
                    break;
                }
            } if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d%n", combinations, magicNumber);
        }
    }
}
