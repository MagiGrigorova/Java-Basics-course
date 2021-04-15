import java.util.Scanner;

public class SumOfTwoNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scan.nextLine());
        int finalNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int combinations = 0;
        boolean flag = false;
        int currentI = 0;
        int currentJ = 0;

        for (int i = startingNumber; i <= finalNumber; i++) {
            currentI = i;
            for (int j = startingNumber; j <= finalNumber; j++) {
                currentJ = j;
                combinations++;
                if (i + j == magicNumber) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, currentI, currentJ, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d%n", combinations, magicNumber);
        }
    }
}
